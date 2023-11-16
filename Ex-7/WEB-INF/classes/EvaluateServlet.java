import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/EvaluateServlet")
public class EvaluateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();


        // Define correct answers
        Map<String, String> correctAnswers = new HashMap<>();
        correctAnswers.put("q1", "Paris");
        correctAnswers.put("q2", "false");
        correctAnswers.put("q3", "Jupiter");


        int score = 0;


        // Evaluate each question
        for (String question : correctAnswers.keySet()) {
            String userAnswer = request.getParameter(question);
            if (userAnswer != null && userAnswer.equals(correctAnswers.get(question))) {
                score++;
            }
        }


        // Store the score in the session
        session.setAttribute("score", score);


        // Redirect to the result page
        response.sendRedirect("result.jsp");
    }
}
