import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddressServlet extends HttpServlet {
    private void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletExcpetion IOException {

            request.setCharacterEncoding("UTF-8");      //���{����͏����igetParameter���O�ɋL�q����j
            String strCity = request.getParameter("city");

            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();

            out.println("<html><head><title>���ʏo��</title></head><body>");
            //out.pintln("strCity");
            out.println(htmlencode(strCity));   //HTML�G���R�[�h����
            out.println("</body></html>");
        }
    
}
