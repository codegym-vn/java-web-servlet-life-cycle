import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet {

    public ServletLifeCycle()
    {
        System.out.println("Am from default constructor");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Am from Init method...!");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("I am from doGet method");
        pw.close();
    }

    @Override
    public void destroy() {
        System.out.println("Am from Destroy methods");
    }
}
