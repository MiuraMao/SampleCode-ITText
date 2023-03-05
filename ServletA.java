//サーブレットコンテキスト
//複数のサーブレットで属性名を付けて共有（文字列など）
//サーブレットAの処理
ServletContext application = this.getServletConfig().getServletContext();
application.setAttribute ("SharedString", new String("This is a shared message"));

//サーブレットBの処理
ServletContext application = this.getServletConfig().getServletContext();
String sharedVal = (String)application.getAttribute("SharedString");