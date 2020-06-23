package vue.sb.lg.controller;

import java.util.Objects;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import vue.sb.lg.entity.Result;
import vue.sb.lg.entity.User;

@Controller
public class LoginController {

	@CrossOrigin // 跨域支持
	@PostMapping(value = "api/login")
	@ResponseBody
	public Result login(@RequestBody User requestUser, HttpSession session) {
		// 对 html 标签进行转义，防止 XSS 攻击
		String username = requestUser.getUsername();
		username = HtmlUtils.htmlEscape(username);

		if (!Objects.equals("admin", username) || !Objects.equals("123456", requestUser.getPassword())) {
			String message = "账号密码错误";
			System.out.println("test");
			return new Result(400);
		} else {
			session.setAttribute("user", requestUser);
			return new Result(200);
		}
	}
	


}
