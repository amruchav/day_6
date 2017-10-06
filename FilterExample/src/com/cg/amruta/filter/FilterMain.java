package com.cg.amruta.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/FilterMain")
public class FilterMain implements Filter {
	

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		String password=request.getParameter("pw");
		if(password.equals("admin"))
		{
		RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");
		rd.include(request, response);
		//chain.doFilter(request, response);
		}
		else
		{
			out.print("Sorry, your password is wrong");
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
	}

	public void destroy() {
		
	}

	

}
