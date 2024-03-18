

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.PreparedStatement;
/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name = request.getParameter("name");
		String fname=request.getParameter("fathername");
		String dob= request.getParameter("dob");
		String gender= request.getParameter("gender");
		String phone= request.getParameter("phoneNumber");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myapp","root","iamGod@293");
			
			String sql ="insert into details values(?,?,?,?,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1,name);
			ps.setString(2,fname);
			ps.setString(3,dob);
			ps.setString(4,gender);
			ps.setString(5,phone);
			ps.setString(6,password);
			ps.setString(7,email);
			
			int i=ps.executeUpdate();
			
			if(i>0)
			{
				response.sendRedirect("loginacc.html");
			}	
			
			
			/*
			 session.setAttribute("email",null);
			 session.invalidate();
			 session.sendRedirect("login.html");
			 
			 
			 
			 
			 1. servlet dispatcher
			 2. servlet filter
			 
			 
			 
			 
			 */
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		
		out.close();
	}

}
