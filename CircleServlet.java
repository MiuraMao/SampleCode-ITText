import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CircleServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletExcpetion, IOException {

            String strRadius = request.getParameter("radius");
            double r = Double.parseDouble(strRadius);
            double S = 3.14 * r * r;

            response.setContentType("text/htmll charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<html><head><title>åãâ èoóÕ</title></head><body>");
            out.println("ñ êœ = " + S + " cm<sup>2</sup>");
            out.println("</body></html>");
        }
}
