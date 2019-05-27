package net.zzqd.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.jasper.tagplugins.jstl.core.Out;
import org.apache.tomcat.dbcp.pool2.UsageTracking;

import net.zzqd.domain.User;
import net.zzqd.service.UserService;
import net.zzqd.service.impl.UserServiceImpl;
import net.zzqd.utils.ActiveCodeUtils;
import net.zzqd.utils.DruidUtils;
import net.zzqd.utils.ValidateCode;
/**
 * 注册功能
 * @author zzq
 *
 * 2019年5月6日
 */

@WebServlet("/reg")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService = new UserServiceImpl();   
    public RegisterServlet() {
        super();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		//1编码
		response.setContentType("text/html;charset=utf-8");
		HttpSession session=request.getSession();
        User user = new User();
		try {
			//用Bean工具包反射从表单获取的数据存储到bean对象中
			BeanUtils.populate(user, request.getParameterMap());
			int flag=0;
			flag = userService.regist(user);
			if(flag!=0)
			{
				session.setAttribute("msg", "恭喜您，注册成功！");
				response.sendRedirect(request.getContextPath()+"/reg.jsp");
			}
			else
			{
				session.setAttribute("msg", "不好意思，请重新注册");
				response.sendRedirect(request.getContextPath()+"/login.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
