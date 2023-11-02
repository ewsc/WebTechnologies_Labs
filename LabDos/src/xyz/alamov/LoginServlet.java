package xyz.alamov;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Perform authentication (e.g., validate against a user database)
        boolean isAuthenticated = authenticate(username, password);

        if (isAuthenticated) {
            // Create a session and store user information
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            // Redirect to a protected resource or home page
            response.sendRedirect("home.jsp");
        } else {
            // Display an error message or redirect back to the login page
            response.sendRedirect("login.html?error=true");
        }
    }

    private boolean authenticate(String username, String password) {
        // Implement your authentication logic here
        // For simplicity, this example assumes a hard-coded username and password
        return username.equals("admin") && password.equals("password");
    }
}