/*SET USERNAME AS COOKIE AND REDIRECT TO INBOX*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class p7_c1 extends HttpServlet {
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
   {
     try{
        response.setContentType("text/html");

        PrintWriter pwriter = response.getWriter();

        String in_uname = request.getParameter("uname");
        
        Cookie c = new Cookie("UserCookie",in_uname);      

        response.addCookie(c);

        pwriter.print("<h3>Welcome:</h3>"+in_uname);

        pwriter.println("<br /> Kindly click the following link to visit your inbox");

        pwriter.print("<br /> <a href='cookieC2'>INBOX</a>");
      
        pwriter.close();
    }
     catch(Exception exp){
       System.out.println(exp);
     }
  }
}