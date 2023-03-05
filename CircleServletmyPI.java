import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CircleServlet extends HttpServlet {
    private double myPI;

    public void init(ServletConfig conf) {
        throws ServletExcpetion {
            super.init(conf);   //最初の行で必ずsuper.init(conf)を呼び出すこと！（サーブレット初期化）
            myPI = Double.parseDouble(conf.getInitParameter("pi")); //サーブレット固有の初期化パラメータを読み込む
        }
    }
    //以下略

}

