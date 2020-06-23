package vue.sb.lg.error;

import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.boot.web.servlet.ErrorPageRegistrar;
import org.springframework.boot.web.servlet.ErrorPageRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * vue前端打包合并至后端后不能访问出现的问题解决方式
 * @author wangzunmin
 *
 */
@Component
public class ErrorConfig implements ErrorPageRegistrar {


	@Override
	public void registerErrorPages(ErrorPageRegistry registry) {
		ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/index.html");
        registry.addErrorPages(error404Page);
	}

}
