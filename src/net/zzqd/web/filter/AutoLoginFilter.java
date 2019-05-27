package net.zzqd.web.filter;
/**
 * 自动登陆过滤器
 * 
 */

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import net.zzqd.domain.User;
import net.zzqd.utils.DruidUtils;

@WebFilter("/login.html")
public class AutoLoginFilter implements Filter {

	public AutoLoginFilter() {

	}

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 1登陆过，session中存在用户
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		if (user != null) {
			req.getRequestDispatcher("/index.html").forward(request, response);
			return;
		} else {
			// 读取浏览器发来的cookie
			Cookie[] cookies = req.getCookies();
			if (cookies != null) {
				for (Cookie cookie : cookies) {
					{
						if (cookie.getName().equals("userinfo")) {
							String userinfo = cookie.getValue();
							String[] userinfos = userinfo.split("#");
							QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
							String email = userinfos[0];
							String password = userinfos[1];
							try {//读取从cookie中取到的数据，和数据库里的比较
								List<User> query = queryRunner.query(
										"select * from tb_user where email=? and password=?",
										new BeanListHandler<User>(User.class), email, password);
								if (query.size() > 0) {
									req.getRequestDispatcher("/index.html").forward(request, response);
									return;
									
								}
							} catch (SQLException e) {
								e.printStackTrace();
							}

						}

					}
				}

			}

		}
		// 放行
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
