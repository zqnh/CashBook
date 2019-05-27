package net.zzqd.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.zzqd.domain.Category;
import net.zzqd.domain.User;
import net.zzqd.service.CategoryService;
import net.zzqd.service.UserService;
import net.zzqd.service.impl.CategoryServiceImpl;
import net.zzqd.service.impl.UserServiceImpl;
/**
 * 注册功能
 * @author zzq
 *
 * 2019年5月6日
 */

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService = new UserServiceImpl();   
	private CategoryService categoryService = new CategoryServiceImpl();   
    public LoginServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1编码
		response.setContentType("text/html;charset=utf-8");
		//2获取数据
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		//3从数据库中查找数据判断
		String remember=request.getParameter("remember");
		try {
			User user = userService.login(email, password);
			if (user != null) 
			{
				List<Category> categories = categoryService.findAll();
				if(!categories.isEmpty())
				{
					Category category=new Category();
					for(int i = 0;i < categories.size();i++)
					{
						Category a = categories.get(i);//直接拿这个a去点get或者set就行了
						category.setCid(a.getCid());
						category.setName(a.getName());
						category.setCreateTime(a.getCreateTime());
						category.setUpdateTime(a.getUpdateTime());
						category.setCanRemove(a.getCanRemove());
						category.setColor(a.getColor());
						category.setType(a.getType());
						category.setLogo(a.getLogo());
						
					}
					categories.add(category);
					HttpSession session =request.getSession();
					user.setNikeName(email);
					session.setAttribute("loginUser", user);
					session.setAttribute("clist", categories);
		            response.sendRedirect(request.getContextPath()+"/main.jsp"); 
				}
	        } else {
	            request.setAttribute("msg", "用户名或密码不匹配");
	            response.sendRedirect(request.getContextPath() + "/login.jsp");
	        }
		} catch (Exception e) {
			e.printStackTrace();
		}
		/**
		try {
			
			if(query.size()>0)
			{
				if(remember!=null)
				{
					//登陆成功
					HttpSession session = request.getSession();
					session.setAttribute("user", user);
					//创建cookies
					Cookie cookie = new Cookie("userinfo", email+"#"+password);
					cookie.setMaxAge(60*60*24*7);
					cookie.setPath(request.getContextPath());
					cookie.setHttpOnly(true);
					response.addCookie(cookie);
				}
					//5重定向
				response.sendRedirect(request.getContextPath()+"/index.html");
				return ;
			}
			
		} catch (Exception e) {
			throw new RuntimeException("用户不存在");
		}
			response.sendRedirect(request.getContextPath()+"/login.html");
**/
	} 

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
