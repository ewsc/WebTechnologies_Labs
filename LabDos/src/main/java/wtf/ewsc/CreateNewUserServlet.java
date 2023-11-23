package wtf.ewsc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CreateNewUserServlet")
public class CreateNewUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        // Perform input validation if necessary

        // Insert data into the database
        try {
            Connection connection = DBConnection.getConnection();
            String sql = "INSERT INTO users (name, username, password) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, username);
            statement.setString(3, password);
            statement.executeUpdate();
            statement.close();
            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            // Handle any errors that occur during database operations
            e.printStackTrace();
        }

        // Redirect or display a success message
        response.sendRedirect("/");
    }
}