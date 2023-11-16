<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Exam Result</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h1>Exam Result</h1>


    <%


    // Retrieve the score and user answers from the session
    HttpSession session = request.getSession();
    int score = (int) session.getAttribute("score");


    Map<String, String> userAnswers = new HashMap<>();
    userAnswers.put("q1", request.getParameter("q1"));
    userAnswers.put("q2", request.getParameter("q2"));
    userAnswers.put("q3", request.getParameter("q3"));


    // Define correct answers
    Map<String, String> correctAnswers = new HashMap<>();
    correctAnswers.put("q1", "Paris");
    correctAnswers.put("q2", "false");
    correctAnswers.put("q3", "Jupiter");


    %>


    <p>Your score: <%= score %> out of <%= correctAnswers.size() %></p>


    <h2>Question-wise Results:</h2>
    <ul>
        <%
        // Display individual question results
        for (String question : correctAnswers.keySet()) {
            String userAnswer = userAnswers.get(question);
            String correctAnswer = correctAnswers.get(question);


            %>
            <li>
                <strong>Question:</strong> <%= question %><br>
                <strong>Your Answer:</strong> <%= userAnswer == null ? "Not answered" : userAnswer %><br>
                <strong>Correct Answer:</strong> <%= correctAnswer %><br>
                <hr>
            </li>
        <% } %>
    </ul>


</body>
</html>


