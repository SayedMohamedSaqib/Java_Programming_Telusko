import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet {

    static {
        System.out.println("Servlet class has been loaded...");
    }

    // Constructor
    public ServletLifeCycle() {
        System.out.println("Servlet object has been created...");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet initialized...");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        System.out.println("Service method called...");

        // Print on webpage
        res.setContentType("text/html");

        PrintWriter out = res.getWriter();
        out.println("<h1>Servlet Service Method Executed</h1>");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet destroyed...");
    }
}