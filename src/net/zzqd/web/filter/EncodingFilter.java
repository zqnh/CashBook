package net.zzqd.web.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 
 * @author zzq
 * 2019年5月26日 下午10:48:45
 * discription:过滤器进行响应编码设置
 * indetail:
 */

@WebFilter("/*")
public class EncodingFilter implements Filter {

    
    public EncodingFilter() {
    }

	
	public void destroy() {
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
	    request.setCharacterEncoding("UTF-8");
		chain.doFilter(req, res);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
