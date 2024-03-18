

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Profile
 */
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Profile() {
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
			//doGet(request, response);
			out.println("<!DOCTYPE html>");
	        out.println("<html lang=\"en\">");
	        out.println("<head>");
	        out.println("<meta charset=\"UTF-8\">");
	        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
	        out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.3/css/bootstrap.min.css\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8sh+WyOVyo2bELqfNEl3QpYTk1eaWjLWoLV2TQ\" crossorigin=\"anonymous\">");
	        out.println("<link rel='stylesheet' href='Profiledes.css'>");
	        out.println("<title>Profile</title>");
	        
	        out.println("</head>");
	        out.println("<body>");

	        HttpSession session = request.getSession();
	        response.setHeader("Cache-Control","No-Cache");
			 response.setHeader("Cache-Control","No-Store");
	        out.println("<div class='container-fluid'>");
	        
            out.println("<div class='main'>");
            
            out.println("<div class='topbar'>");
            out.println("<a class='nav-link' href='loginacc.html'>LOGOUT</a>");
            out.println("<a class='nav-link' href='#'>HELP</a>");
            out.println("<a class='nav-link' href='Changeprofile'>EDIT</a>");
            out.println("<a class='nav-link' href='Changepass'>CHANGE PASSWORD</a>");
            out.println("<a class='nav-link' href='Home'>HOME</a>");
	        out.println("</div>");
	        
	        out.println("<div class='row'>");
	        out.println("<div class='col-md-4 mt-1'>");
	        out.println("<div class='card text-center sidebar'>");
	        out.println("<div class='card-body'>");
	        out.println("<div class='mt-3'>");
	        out.println("<h3>"+session.getAttribute("naam")+"</h3>");
	        out.println("</div>");
	        
	        out.println("</div>");
	        out.println("</div>");
	        out.println("</div>");
	        
	        out.println("<div class='col-md-8 mt-1'>");
	        out.println("<div class='card mb-3 content'>");
	     
	        out.println("<div class='card-body'>");
	        out.println("<div class='row'>");
	        out.println("<div class='col-md-4'>");
	        out.println("<h3>FULL NAME</h3>");
	        out.println("</div>");
	        out.println("<div class='col-md-9 text-secondary'>");
	        out.println("<h4>"+session.getAttribute("naam")+"</h4>");
	        out.println("</div>");
	        
	        out.println("</div>");
	        out.println("<hr>");
	        
	        out.println("<div class='row'>");
	        out.println("<div class='col-md-4'>");
	        out.println("<h3>FATHER NAME</h3>");
	        out.println("</div>");
	        out.println("<div class='col-md-9 text-secondary'>");
	        out.println("<h4>"+session.getAttribute("fnaam")+"</h4>");
	        out.println("</div>");
	        
	        out.println("</div>");
	        out.println("<hr>");
	        
	        
	        out.println("<div class='row'>");
	        out.println("<div class='col-md-4'>");
	        out.println("<h3>email id</h3>");
	        out.println("</div>");
	        out.println("<div class='col-md-9 text-secondary'>");
	        out.println("<h4>"+session.getAttribute("email")+"</h4>");
	        out.println("</div>");
	        
	        out.println("</div>");
	        out.println("<hr>");
	        
	        
	        
	        out.println("<div class='row'>");
	        out.println("<div class='col-md-4'>");
	        out.println("<h3>Gender</h3>");
	        out.println("</div>");
	        out.println("<div class='col-md-9 text-secondary'>");
	        out.println("<h4>"+session.getAttribute("gender")+"</h4>");
	        out.println("</div>");
	        
	        out.println("</div>");
	        out.println("<hr>");
	        
	        
	        out.println("<div class='row'>");
	        out.println("<div class='col-md-4'>");
	        out.println("<h3>DOB</h3>");
	        out.println("</div>");
	        out.println("<div class='col-md-9 text-secondary'>");
	        out.println("<h4>"+session.getAttribute("dob")+"</h4>");
	        out.println("</div>");
	        
	        out.println("</div>");
	        out.println("<hr>");
	        
	        out.println("<div class='row'>");
	        out.println("<div class='col-md-4'>");
	        out.println("<h3>Phone Number</h3>");
	        out.println("</div>");
	        out.println("<div class='col-md-9 text-secondary'>");
	        out.println("<h4>"+session.getAttribute("phone")+"</h4>");
	        out.println("</div>");
	        
	        out.println("</div>");
	        
	        
	        
	        
	        out.println("</div>");
	        
	        out.println("</div>");
	        out.println("</div>");
	        
	        
	        out.println("</div>");
	        
	        out.println("</div>");
	        
	        out.println("</div>");
	        
	      /*  out.println("<table>");
	        out.println("<tr>");
	        
	        out.println("<td>");
	        out.println("Name : ");
	        out.println("</td>");
	        
	        out.println("<td>");
	        out.println("<h4>"+session.getAttribute("naam")+"</h4>");
	        out.println("</td>");
	        
	        out.println("</tr>");
	        
	        
	        
            out.println("<tr>");
	        
	        out.println("<td>");
	        out.println("Father Name : ");
	        out.println("</td>");
	        
	        out.println("<td>");
	        out.println("<h4>"+session.getAttribute("fnaam")+"</h4>");
	        out.println("</td>");
	        
	        out.println("</tr>");
	        
             out.println("<tr>");
	        
	        out.println("<td>");
	        out.println("email : ");
	        out.println("</td>");
	        
	        out.println("<td>");
	        out.println("<h4>"+session.getAttribute("email")+"</h4>");
	        out.println("</td>");
	        
	        out.println("</tr>");
	        
            out.println("<tr>");
	        
	        out.println("<td>");
	        out.println("dob : ");
	        out.println("</td>");
	        
	        out.println("<td>");
	        out.println("<h4>"+session.getAttribute("dob")+"</h4>");
	        out.println("</td>");
	        
	        out.println("</tr>");
	        
            out.println("<tr>");
	        
	        out.println("<td>");
	        out.println("Gender : ");
	        out.println("</td>");
	        
	        out.println("<td>");
	        out.println("<h4>"+session.getAttribute("gender")+"</h4>");
	        out.println("</td>");
	        
	        out.println("</tr>");
	        
            out.println("<tr>");
	        
	        out.println("<td>");
	        out.println("Phone no. : ");
	        out.println("</td>");
	        
	        out.println("<td>");
	        out.println("<h4>"+session.getAttribute("phone")+"</h4>");
	        out.println("</td>");
	        
	        out.println("</tr>");
	        
           out.println("<tr>");
	        
	        out.println("<td>");
	        out.println("<form action='Changepass' method='post'>");
	        out.println("<div><a href='Changepass' name='changepass' class='badge bg-secondary'>Changepassword</a></div>");
	        
	        out.println("</form>");
	        
	        
	        out.println("</td>");
	        
	        out.println("</tr>");
	        
            out.println("<tr>");
	        
	        out.println("<td>");
	        
	        out.println("<form action='Changeprofile' method='post'>");
	        out.println("<div><a href='Changeprofile' name='changeprofile' class='badge bg-secondary'>Change profile</a></div>");
	        
	        out.println("</form>");
	        
	        out.println("</td>");
	        
	        out.println("</tr>");
	        
	        
	        
	        
	        out.println("</table>");*/
	        
	        
	       
	        
	        
	       /* out.println("<h4>WELCOME....."+session.getAttribute("naam")+"</h4>");
	        out.println("<h4>"+session.getAttribute("email")+"</h4>");
	        out.println("<h4>"+session.getAttribute("fnaam")+"</h4>");
	        out.println("<h4>"+session.getAttribute("gender")+"</h4>");
	        out.println("<h4>"+session.getAttribute("dob")+"</h4>");
	        out.println("<h4>"+session.getAttribute("phone")+"</h4>");*/
	        

	      /*  out.println("<form action='Changepass' method='post'>");
	        out.println("<div><a href='Changepass' name='changepass' class='badge bg-secondary'>Changepassword</a></div>");
	        
	        out.println("</form>");*/
	        
	      /*  out.println("<form action='Changeprofile' method='post'>");
	        out.println("<div><a href='Changeprofile' name='changeprofile' class='badge bg-secondary'>Change profile</a></div>");
	        
	        out.println("</form>");
	        */
	      
	        
	        out.println("</body>");
	        out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	   
	}

}
