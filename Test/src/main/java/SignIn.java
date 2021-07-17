

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.*;





/**
 * Servlet implementation class SignIn
 */
@WebServlet("/SignIn")
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignIn() {
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
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=request.getParameter("uname");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		
		response.setContentType("application/json");
		JSONObject obj = new JSONObject();
		
			try {
				obj.put("name", "anusuya");
				obj.put("email", "anu@gmail.com");
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	   
	    
	    PrintWriter out = response.getWriter();
	    out.println("<h1>" + uname + "</h1>");
		if(uname.equals("anusuya") && password.equals("1234") && email.equals("anu@gmail.com"))
		{
			request.setAttribute("uname",uname);
			request.setAttribute("email",email);
			request.setAttribute("jsonDetails", obj);
			request.getRequestDispatcher("member.jsp").forward(request,response);
		}
		else
		{
			response.sendRedirect("error.jsp");
		}
	    
	    /*request.setAttribute("uname",uname);
		request.setAttribute("email",email);
		request.getRequestDispatcher("member.jsp").forward(request,response);*/
	}

}
