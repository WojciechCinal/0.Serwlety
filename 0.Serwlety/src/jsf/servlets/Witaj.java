package jsf.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Witaj extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
					throws ServletException, IOException
	{
		resp.setContentType("text/html; charset=UTF-8");

		PrintWriter out = resp.getWriter();
		
		resp.setHeader("Refresh", "10");
		
		String data = new Date().toString();
	    
		out.println("<html>\n<body>\n" + data +
		            "\n<h1>Hello world!!!</h1><br>\n" +
	               "<img border=\"0\" src=\"images/hello_hand_icon.png\">\n" +
		            "</body>\n</html>");
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
					throws ServletException, IOException
	{
		doGet(req, resp);
	}
}
