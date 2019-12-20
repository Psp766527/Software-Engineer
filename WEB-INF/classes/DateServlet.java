package com.nt.servlet;

import javax.servlet.*;
import java.io.*;
import java.util.*;

public class DateServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		//set response content type
			res.setContentType("text/html");
		//get printWritter object
		PrintWriter pw=res.getWriter();
		// write response
		Date d=new Date();
		pw.println("<b><i><center>Date and Time is "+d+"  </b></i></center>");
		//close stream
		pw.close();
	}//service(-,-)
}//class