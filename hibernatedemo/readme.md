# Hibernate #
1. 在pom中导入Hibernate需要依赖的包
2. 对项目进行Soureces Root与Resources Root的配置，引入hibernate所需要的xml文件
3. 在Structure中添加hibernate的文件，生成hibernate.cfg.xml
4. 设置hibernate文件
* 
		<property name="hibernate.connection.username">root</property>		
				<!--  mysql密码  -->
		<property name="hibernate.connection.password"></property>
				<!--  mysql驱动  -->
		<property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>
				<!--  mysql连接URL  -->		 
		<property name="hibernate.connection.url">jdbc:mysql://localhost/数据库名?useUnicode=true&characterEncoding=UTF-8</property>	
				<!--  数据库方言  -->
		<!--<property name="dialect">org.hibernate.dialect.MySQLDialect</property>-->
				<!--// 5.0之后使用的数据库方言-->
		<property name="dialect">org.hibernate.dialect.MySQL5Dialect</property>		
				<!--  显示sql语句  -->
		<property name="show_sql">true</property>		
				<!--  格式化sql语句  -->
		<property name="format_sql">true</property>
5. 连接数据库
6. 在控制台可以用sql语句操作数据库，新建表
7. 创建一个表，在View的Persistence中，选中数据库数据源，将要导出的表和项目进行关联，此时生成一个新建表实体类
8. 在hibernate文件中，用<mapping class>添加类配置
9. 创建测试类
	* @Test：要测试的方法。<br/>
	@Before：初始化方法（表示在测试前会先执行before方法进行初始化）<br/>
	@After：释放资源。
	* 执行次序：@before下的方法——>@test方法——>@after释放资源
	* @before

* 	
		//创建会话工厂
        sessionFactory = new Configuration().configure().buildSessionFactory();
        // 开启会话
        session =sessionFactory.openSession();
        //开启事务
        transaction = session.beginTransaction();
	* @After
*		
		//关闭事务
		transaction.commit();
		//关闭对话
		session.close();
		// 关闭会话工厂
		sessionFactory.close();
		}
10.在Test注解中创建一个实体类的对象，用set方法给私有变量赋值，并用session的save方法存入数据库中



