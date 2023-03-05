import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddressServlet extends HttpServlet {
    private void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletExcpetion IOException {

            request.setCharacterEncoding("UTF-8");      //日本語入力処理（getParameterより前に記述する）
            String strCity = request.getParameter("city");

            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();

            out.println("<html><head><title>結果出力</title></head><body>");
            //out.pintln("strCity");
            out.println(htmlencode(strCity));   //HTMLエンコード処理
            out.println("</body></html>");
        }
    
}
