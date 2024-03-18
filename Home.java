

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Home
 */
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		/*
		 
		 response.setHeader("Cache-Control","No-Cache");
		 response.setHeader("Cache-Control","No-Store");
		 HttpSession session = request.getSession();
		 
		 object email=session.fetAttribute("email");
		 if(email!=null)
		 {
		 whole body
		 }*/
		 response.setHeader("Cache-Control","No-Cache");
		 response.setHeader("Cache-Control","No-Store");
        
		HttpSession session = request.getSession();
		 
		 Object email=session.getAttribute("email");
		if(email!=null)
		{
		 out.println("<!DOCTYPE html>");
	        out.println("<html lang=\"en\">");
	        out.println("<head>");
	        out.println("<meta charset=\"UTF-8\">");
	        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
	       out.println("<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>");
	        out.println("<link href='homedesign.css' rel='stylesheet'>");
	        out.println("<script src='allJS.js'></script>");
	        out.println("<title>Dashboard</title>");
	        
	        out.println("</head>");
	        out.println("<body>");
	        
	        
	      out.println("<div class='container-fluid banner'>");
	       
	          out.println("<div class='row'>");
	               
	             out.println("<div class='col-md-12'");
	             out.println("<nav class='navbar-expand-lg fixed-top text-uppercase'>");
	              out.println("<div class='navbar brand'>");
	              out.println("<h3>{c}ode<u style=\"color: red;\">B</u><font style=\"color: red;\">etter</font></h3>");
	               out.println("</div>");
	               out.println("<ul class='nav'");
	               out.println("<li class='nav-item'>");
	               out.println("<a class='nav-link' href='#'>HOME</a>");
	               out.println("</li>");
	               out.println("<li class='nav-item'>");
	               out.println("<a class='nav-link' href='#'>ABOUT</a>");
	               out.println("</li>");
	               out.println("<li class='nav-item'>");
	               out.println("<a class='nav-link' href='Profile'>PROFILE</a>");
	               out.println("</li>");
	               out.println("<li class='nav-item'>");
	               out.println("<a class='nav-link' href='#'>CONTACT</a>");
	               out.println("</li>");
	               out.println("<li class='nav-item'>");
	               out.println("<form action='Logout'>");
	               out.println("<a class='nav-link' href='loginacc.html'>LOGOUT</a>");
	               session.setAttribute("email",email);
	   	               out.println("</form>");
	               out.println("</li>");
	               out.println("</ul>");
	               out.println("</nav>");
	             out.println("</div>");
	             
	             
	          out.println("</div>");
	      
	       out.println("</div>"); 
	        
	        
	      
	        
	        out.println("</body>");
	        out.println("</html>");
	       
			
			
	        
		}
	        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
	}

}
