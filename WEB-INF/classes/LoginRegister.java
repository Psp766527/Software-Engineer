package com.pk.raj;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerDAO cd=new CustomerDAOImpl();
		String userName=request.getParameter("username");
		String password=request.getParameter("password1");
		String submitType=request.getParameter("submit");
		Customer c=cd.getCustomer(userName,password);
		
		
		if(submitType.equals("login") && c!=null && c.getName()!=null){
			request.setAttribute("message", c.getName());
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}else if(submitType.equals("register")){
			c.setName(request.getParameter("name"));
			c.setPassword(password);
			c.setUsername(userName);
			request.setAttribute("successMessage","Registration successfull,please login");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else {
			request.setAttribute("message","Data Not Found,Click on register !");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
