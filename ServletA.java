//�T�[�u���b�g�R���e�L�X�g
//�����̃T�[�u���b�g�R���e�L�X�g�ő�������t���ċ��L�i������Ȃǁj
//�T�[�u���b�gA�̏���
ServletContext application = this.getServletConfig().getServletContext();
application.setAttribute ("SharedString", new String("This is a shared message"));

//�T�[�u���b�gB�̏���
ServletContext application = this.getServletConfig().getServletContext();
String sharedVal = (String)application.getAttribute("SharedString");