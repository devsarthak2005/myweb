

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class Changepass
 */
public class Changepass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Changepass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		/* HttpSession session = request.getSession();
		Object email=session.getAttribute("email");
		Object password=session.getAttribute("password"); */
		out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8sh+WyOVyo2bELqfNEl3QpYTk1eaWjLWoLV2TQ\" crossorigin=\"anonymous\">");
        out.println("<script src='changepw.js'></script>");
        out.println("<title>Changepassword</title>");
        
        
        out.println("</head>");
        out.println("<body>");
        out.println("<form action='Changepass' method='post'>");
        out.println("<div><input type='email' name='email' id='email' placeholder='email'></div>");
        
        out.println("<div><input type=\"password\" name=\"cpassword\" id=\"cpassword\" placeholder=\"confirm old password\"></div>");
        out.println("<div><input type='password' name='newpassword' id='newpassword' placeholder='newpassword'></div>");
        out.println("<div><input type=\"password\" name=\"cnpassword\" id='cnpassword' placeholder=\"confirm newpassword\" ></div>");
        out.println("<div><input type=\"submit\" name=\"submit\" value='submit' ></div>");
        out.println("</form>");
 
        
        out.println("</body>");
        out.println("</html>");
		
		String email=request.getParameter("email");
		String password=request.getParameter("newpassword");
		String submit= request.getParameter("submit");
		String oldpassword=request.getParameter("cpassword");
	
		if(submit.equals("submit"))
		{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myapp","root","iamGod@293");
			
			String sql2="select * from details where email=? AND password=?";
			
			PreparedStatement ps2 = con.prepareStatement(sql2);
			ps2.setString(1,email);
			ps2.setString(2,oldpassword);
			
			
			
			ResultSet rs = ps2.executeQuery();	
			if(rs.next())
			{
			String sql="update details set password=? where email=?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,password);
			ps.setString(2, email);
			
			int i=ps.executeUpdate();
			if(i>0)
			{
				response.sendRedirect("Profile");
			}
			}
			else
			{
				out.println("your password is incorrect..");
			}
			
			
		}
		catch(Exception e)
		{
			
		}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
