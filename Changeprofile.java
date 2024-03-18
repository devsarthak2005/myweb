
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
import java.util.*;

/**
 * Servlet implementation class Changeprofile
 */
public class Changeprofile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Changeprofile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8sh+WyOVyo2bELqfNEl3QpYTk1eaWjLWoLV2TQ\" crossorigin=\"anonymous\">");
        out.println("<title>Dashboard</title>");
        
        out.println("</head>");
        out.println("<body>");

        HttpSession session = request.getSession();
        String name=(String)(session.getAttribute("naam"));
        String email=(String)session.getAttribute("email");
        String fname=(String)session.getAttribute("fnaam");
        String gender=(String)session.getAttribute("gender");
        String dob=(String)session.getAttribute("dob");
        String phone=(String)session.getAttribute("phone");
        out.println("<form action='Changeprofile'>");
        out.println("<div><input type='text' name='name' placeholder='name'></div>");
        out.println("<div><input type='text' name='fname' placeholder='father name'><div>");
        out.println("<div><input type='date' name=dob placeholder='date'></div>");
        out.println("<div><input type='tel' name='phone' placeholder='phone number'></div>");
        out.println("<label>Gender:</label><div class=\"form-check\">"
        		+ "<input type=\"radio\" id=\"male\" name=\"gender\" value=\"male\" class='form-check-input'"
        		+ " <label for=\"male\" class=\"form-check-label\">Male</label>"
        		+ "</div><div class=\"form-check\">"
        		+ "<input type=\"radio\" id=\"female\" name=\"gender\" value=\"female\" class=\"form-check-input\""
        		+ "<label for=\"female\" class=\"form-check-label\">Female</label>");
        
       out.println("<div><input type=\"submit\" name=\"submit\" value='submit' ></div>");
      out.println("</form>");
  
        out.println("</body>");
        out.println("</html>");
        
        String newname=request.getParameter("name");
        String newfname=request.getParameter("fname");
        String newdob=request.getParameter("dob");
        String newphone=request.getParameter("phone");
        String newgender=request.getParameter("gender");
        String submit=request.getParameter("submit");
        ArrayList<String> s2 = new ArrayList();
        s2.add(name);
        s2.add(fname);
        s2.add(dob);
        s2.add(gender);
        s2.add(phone);
        
       out.println(s2);
        
        
        ArrayList<String> s1 = new ArrayList();
        s1.add(newname);
        s1.add(newfname);
        s1.add(newdob);
        s1.add(newgender);
        s1.add(newphone);
       
       /* for(int i=0; i<5; i++)
		 {
			 if(s1.get(i)==null)
			 {
				 s1.set(i,s2.get(i));
			 }
			
		 }*/
        out.println(s1); 
        
        
        
       /* try
        {
        	Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myapp","root","iamGod@293");
			
			if(submit.equals("submit"))
			{
			
			 
			
			 String sql2="select * from details where email=?";
				
				PreparedStatement ps2 = con.prepareStatement(sql2);
				ps2.setString(1,email);
				
				
				
				
				ResultSet rs = ps2.executeQuery();	
				if(rs.next())
				{
				String sql="update details set name=?,fathername=? , dob=? , gender=? , phone=? where email=?";
				
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1,s1.get(0));
				ps.setString(2,s1.get(1));
				ps.setString(3,s1.get(2));
				ps.setString(4,s1.get(3));
				ps.setString(5,s1.get(4));
				ps.setString(6,s1.get(5));
				
				int i=ps.executeUpdate();
				if(i>0)
				{
					response.sendRedirect("Profile");
				}
				
				}
				
			}
        	
			
		} 
        catch (Exception e) 
        {
			
		} */
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
