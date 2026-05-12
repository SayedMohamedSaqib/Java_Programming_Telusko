import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/RegisterServletApp")
public class RegisterServletApp extends HttpServlet {

    protected void doPost(
            jakarta.servlet.http.HttpServletRequest req,
            jakarta.servlet.http.HttpServletResponse resp)
            throws jakarta.servlet.ServletException, java.io.IOException {

        String name = req.getParameter("uname");
        String city = req.getParameter("ucity");
        System.out.println("Name " + name + " City" + city);
        PrintWriter writer = resp.getWriter();

        resp.sendRedirect(req.getContextPath() + "/success.jsp");
    }
}