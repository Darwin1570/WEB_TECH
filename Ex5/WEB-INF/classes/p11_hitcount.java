import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class p11_hitcount extends HttpServlet 
{
    private int hitCount;
    public void init() {
        // Reset hit counter during refersh.
        hitCount = 0;
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");
        // increment hitCount
        hitCount++;
        PrintWriter out = response.getWriter();
        out.print("<h1>"+"Scholarship Eligibility Criteria"+"</h1>"+"<hr>");
        out.print("<ul>"+"<li>"+"Students who have above 75% marks in Class XII"+"</li>"+"<li>"+"Student must be pursuing regular courses Institutions recognized by AICTE"+
        "</li>"+ "<li>"+ "Student must not availing benefit of any other scholarship scheme"+"</li>"+"</ul>");
        out.print("<br><br>"+"<h3><b>Page Visits :"+hitCount+"</b></h3>");
    }
    public void destroy() {
    //do nothing
    }
}