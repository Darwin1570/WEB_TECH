import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class p11_userhitcount extends HttpServlet 
{
    private int userhitCount;
    public void init() {
        // Reset hit counter during refersh.
        userhitCount = 0;
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");
        // increment hitCount
        HttpSession session = request.getSession();
        if(session.isNew()){
            userhitCount++;
        }      
        
        PrintWriter out = response.getWriter();
        out.print("<br><br>"+"<h3><b>Page User Visits :"+userhitCount+"</b></h3>");
        out.close();
    }
    public void destroy() {
    //do nothing
    }
}