package wtf.ewsc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Objects;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String error = null;
        if (Objects.equals(request.getParameter("error"), "1")) {
            error = "Wrong username or password.";
        }
        request.setAttribute("error", error);
        RequestDispatcher dispatcher = request.getRequestDispatcher("pages/login.jsp");
        dispatcher.forward(request, response);
    }
}

