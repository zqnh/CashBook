package net.zzqd.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.zzqd.utils.ValidateCode;


@WebServlet("/codeservlet")
public class CodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CodeServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1创建一个对象
		ValidateCode validateCode = new ValidateCode(200, 50, 5, 10);
		//把vcode放入session里面
		HttpSession session = request.getSession();
		session.setAttribute("validateCode", validateCode.getCode());
		validateCode.write(response.getOutputStream());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
