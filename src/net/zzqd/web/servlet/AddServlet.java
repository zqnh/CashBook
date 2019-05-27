package net.zzqd.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import net.zzqd.domain.Finace;
import net.zzqd.service.FinaceService;
import net.zzqd.service.impl.FinaceServiceImpl;
/**
 * 
 * @author zzq
 * 2019年5月27日 下午3:30:06
 * discription:记账业务
 * indetail:
 */

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	FinaceService finaceService = new FinaceServiceImpl();
	Date date = new Date();
    public AddServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//编码问题
		response.setContentType("text/html;charset=utf-8");
		Finace finace = new Finace();
		HttpSession session=request.getSession();
		
		String money=request.getParameter("money");
		double moneyD=Double.parseDouble(money);
		String cid=request.getParameter("cid");
		int cidD=Integer.parseInt(cid);
		String details=request.getParameter("details");
		String type=request.getParameter("type");
		int typeD=Integer.parseInt(type);	
		try {
			//时间转换
			date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("addTime")) ;
			finace.setMoney(moneyD);
			finace.setCid(cidD);
			finace.setAddTime(date);
			finace.setDetails(details);
			finace.setType(typeD);	
			int flag = finaceService.add(finace);
			session.setAttribute("msg", "操作成功");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
