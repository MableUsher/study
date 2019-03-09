##Servlet笔记
1. 一个servlet就是一个Java类，可以通过请求的方式访问内存里的servlet实例。先有servlet后有jsp
2. 在idea中实现servlet
	* 新建一个类继承HTTPServlet
	* 重写doGet()或者doPost()方法（取决于提交请求的方式是GET还是POST）
	* 在web.xml中注册Servlet<br/>在web.xml中servlet标签下配置servlet-name（servlet的标识符）和servlet-class（servlet对应的Java类），在servlet-mapping标签下配置名称和URL的对应关系