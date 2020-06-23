package vue.sb.lg.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import vue.sb.lg.entity.User;

/**
 * 登陆拦截器
 * 
 * @author wangzunmin
 *
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
			Object handler) throws Exception {
		HttpSession session = httpServletRequest.getSession();
		String contextPath = session.getServletContext().getContextPath();
		String[] requireAuthPages = new String[] { "index" };

		String uri = httpServletRequest.getRequestURI();

		uri = StringUtils.remove(uri, contextPath + "/");
		String page = uri;

		if (begingWith(page, requireAuthPages)) {
			User user = (User) session.getAttribute("user");
			if (user == null) {
				httpServletResponse.sendRedirect("login");
				return false;
			}
		}
		return true;
	}

	private boolean begingWith(String page, String[] requiredAuthPages) {
		boolean result = false;
		for (String requiredAuthPage : requiredAuthPages) {
			if (StringUtils.startsWith(page, requiredAuthPage)) {
				result = true;
				break;
			}
		}
		return result;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
