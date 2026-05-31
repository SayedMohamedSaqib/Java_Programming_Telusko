import java.io.PrintWriter;
import java.net.http.HttpClient;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet{


    public void service(jakarta.servlet.ServletRequest req, jakarta.servlet.ServletResponse res) throws jakarta.servlet.ServletException ,java.io.IOException {


        PrintWriter writer = res.getWriter();
        writer.println("Response from servlet two");
        writer.close();
    };
}
