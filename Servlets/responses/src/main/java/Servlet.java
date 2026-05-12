import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req,
                          HttpServletResponse resp)
            throws ServletException, IOException {

        // Collect form data
        String name = req.getParameter("uname");
        String city = req.getParameter("ucity");

        // Set response type
        resp.setContentType("text/html");

        // Print on webpage
        PrintWriter out = resp.getWriter();

        out.println("<html><body>");

        out.println("<h1>User Details</h1>");
        out.println("<h2>Name: " + name + "</h2>");
        out.println("<h2>City: " + city + "</h2>");

        if (name.equals("Saqib") && city.equals("Mumbai")) {

            out.println("<h2 style='color:green'>Authorized User</h2>");

        } else {

            out.println("<h2 style='color:red'>Unauthorized User</h2>");
        }

        out.println("</body></html>");
    }
}