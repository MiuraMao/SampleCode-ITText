import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CircleServlet extends HttpServlet {
    private double myPI;

    public void init(ServletConfig conf) {
        throws ServletExcpetion {
            super.init(conf);   //�ŏ��̍s�ŕK��super.init(conf)���Ăяo�����ƁI�i�T�[�u���b�g�������j
            myPI = Double.parseDouble(conf.getInitParameter("pi")); //�T�[�u���b�g�ŗL�̏������p�����[�^��ǂݍ���
        }
    }
    //�ȉ���

}

