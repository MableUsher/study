# spring注解以及junit整合 #
1. @component value	
	* 用于指定bean id 默认类名首字母改小写
2. @resource
 	* 作用：直接按照bean的id注入。它可以独立使用
 	* 属性： name：用于指定bean的id。
3. @Configuration
	* 指定当前类是一个配置类 
4. @ComponentScan
	* 用于通过注解指定spring在创建容器时要扫描的包
 	* 属性：value 和basePackages，用于指定要扫描的包
5. @Bean
 	* 用于把当前方法的返回值作为bean对象存入springioc的容器中
 	* 属性：name：用于指定bean的id 默认值为当前方法的名称
6. 当使用@Bean注解配置方法时，如果方法有参数，spring框架会去容器中查找有没有可用的bean对象，查找的方式和Autowired是一样的
7. @Import 
	* 作用：用于导入其他的配置类
 	* 属性：value：用于指定其他配置类的字节码。
 	* 当我们使用Import的注解之后，有Import注解的类就父配置类，而导入的都是子配置类
8. @PropertySource 
	* 用于指定property文件的位置
9. @Qualifier<br/>用来注解不同方法
   
		createQueryRunber(@Qualifier（"ds2"）DataSource datasource){}
10. 使用Junit单元测试：测试配置
 * Spring整合junit的配置
 * 导入spring整合junit的jar(坐标)
 * 使用Junit提供的一个注解把原有的main方法替换了，替换成spring提供的
11.  @Runwith
 * 告知spring的运行器，spring和ioc创建是基于xml还是注解的，并且说明位置
12. @ContextConfiguration
 * locations：指定xml文件的位置，加上classpath关键字，表示在类路径下
 * classes：指定注解类所在地位置