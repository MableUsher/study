## springmvc ##
1. 添加achetypeCatalog internal键值对使maven更快创建
2. 定义main下新建java resources目录属性
3. 导包，spring版本锁定
4. 在web.xml中配置**前端控制器**DispatcherServlet，定义拦截请求类型(/为拦截任何请求)
5. 创建springmvc配置文件
6. 在服务器中构建项目 路径写项目路径
7. index.jsp中添加头文件 编写请求页面内容 标签中href为*请求路径名*
8. 编写控制器类 定义点击后执行的方法
9. 为了执行方法，必须获得类对象，所以在mvc配置文件中添加注解支持，**开启注解扫描**，在控制器类上添加@Controller注解，交给ioc容器管理
10. 为了方法执行，在方法上添加**请求映射**注解@RequestMapping，注解path属性为*请求路径名*
11. 为了mvc配置文件能被加载，在web.xml中添加**<init-param>**标签,name为contextConfigLoctaion，value为mvc文件路径，
12. 配置<load-on-startup>
13. 在方法中返回一个字符串作为跳转标签
14. 在web-inf中new一个pages文件夹，配置一个跳转页面jsp和方法返回值同名
15. 在mvc中配置**视图解析器**interResourceViewResolver
	* prefix为跳转jsp目录
	* suffix为.jsp后缀
16. @requestMapping注解加在类上表名路径，请求时应该用类路径加上方法路径作为请求路径名
17. input标签的name属性可以通过识别controller类中参数名 实现数据绑定 自动传入请求页面获取的数据封装到类中（个人理解）
18. 在控制器类配置filter过滤器可以解决中文乱码的问题
19. 当account类中有user类的引用，name属性应为user.uname<br/>
	如果是集合属性，list应该为list[index].uname,map为map[key值].uname
20. 自定义类型转换器
21. 获取原生ServletAPI：在方法中加入httpservlet参数
22. restful编程风格：根据请求方式（post put..）的不同来选择执行的方法
23. 方法无返回值需要自己手动通过servlet原生api编写请求转发。路径需要写完整目录
	* 请求转发request
	* 重定向response
24. ModelAndView 可以存储数据也可以定义跳转页面
25. 前端控制器中需要配置不拦截css js等静态资源