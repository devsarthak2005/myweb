

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myapp","root","iamGod@293");
			
			String sql ="select *from details where email=? AND password=?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,email);
			ps.setString(2,password);
			
			
			
			ResultSet rs = ps.executeQuery();	
			
			if(rs.next()) 
			{
				String name=rs.getString(1);
				String fname=rs.getString(2);
				String dob=rs.getString(3);
				String gender=rs.getString(4);
				String phone=rs.getString(5);
				
				HttpSession session = request.getSession();
				
				session.setAttribute("naam",name);
				session.setAttribute("fnaam",fname);
				session.setAttribute("dob",dob);
				session.setAttribute("gender",gender);
				session.setAttribute("phone",phone);
				session.setAttribute("email",email);
				
				response.sendRedirect("Home");
			}
			else
			{
				response.sendRedirect("loginacc.html");
				
			}
			
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		
		
		
	}

}
