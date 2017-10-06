package com.cg.bank.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.bank.Service.CustomerServiceImpl;
import com.cg.bank.Service.ICustomerService;
import com.cg.bank.bean.CustomerBean;

@WebServlet("*.obj")
public class HomeController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerBean bean=new CustomerBean();
		ICustomerService service=new CustomerServiceImpl();
		String path=request.getServletPath();
		System.out.println(path);
		String target=null;
		
		switch(path)
		{
		case "/insert.obj":
			target="newCustomer.html";
			break;
			
		case "/details.obj":
		
		String custname=request.getParameter("name");
		String mobno=request.getParameter("phone");
		String PW=request.getParameter("pw");
		bean.setCustomerName(custname);
		bean.setPhoneNo(mobno);
		bean.setPassword(PW);
		int res=service.addDetails(bean);
		HttpSession session=request.getSession();
		session.setAttribute("custId_seq", res);
		target="success.jsp";
		break;
		
		case "/paybill.obj":
			target="newForm.html";
			break;
		}
	
		RequestDispatcher rd=request.getRequestDispatcher(target);
		rd.forward(request, response);
	
	}
		
}

	


