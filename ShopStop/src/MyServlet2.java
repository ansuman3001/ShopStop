

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet2
 */
@WebServlet("/MyServlet2")
public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext servCon = getServletContext();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<b>" + "Hello " + servCon.getAttribute("Name") + "," + "</b>");
		out.println("<br/>");

		out.println("<br/>");
		out.println("<br/>");
		out.println("<br/>");
		out.println("<b>Sorry, you are not eligible to get a scholarship at our university </b>");
		out.println("<b>, because your percentage of " + servCon.getAttribute("Percent"
				+ ""
				+ ""
				+ ""
				+ "") + " does not meet our criteria.<b>");

		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
