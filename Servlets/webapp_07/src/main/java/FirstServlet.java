import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {

    public void service(jakarta.servlet.ServletRequest req, jakarta.servlet.ServletResponse res) throws jakarta.servlet.ServletException ,java.io.IOException {

        RequestDispatcher reqDispatch = req.getRequestDispatcher("/SecondServlet");

        reqDispatch.include(req, res);

        PrintWriter writer = res.getWriter();

        writer.println("<h1> Response from Servlet One </h1>");
        writer.close();

        System.out.println("Control in First Servlet");
    };
}
