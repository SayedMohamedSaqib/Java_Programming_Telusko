import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {

    public void service(jakarta.servlet.ServletRequest req, jakarta.servlet.ServletResponse res) throws jakarta.servlet.ServletException ,java.io.IOException {

        PrintWriter writer = res.getWriter();
        writer.println("<h1>Response from Servlet Two </h1>");
        writer.close();
    }

}
