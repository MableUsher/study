# SSM整合 #
1. 整合spring和springmvc
	* 在xml中开启注解扫描，spring中忽略对controller类的扫描，mvc中只扫描controller类
	* 若要整合spring，要使配置文件得到加载，此时在web.xml中配置监听器，配置加载类路径，applicationContext
2. 整合spring和mybatis
	* 要整合二者，即解决sqlsession工厂的创建，将其交给ioc容器管理，所以在spring配置文件中配置SqlSessionFactory，并注入数据库
	* 再解决映射配置，MapperScannerConfigurer类可以配置持久层接口，并且能**自动注入**，如果没有发现注解，它就会使用映射器的非大写的非完全限定类名
	* 配置事务管理，可使用声明式事务管理，在spring配置文件中配置事务管理器，事务通知，再配置aop切入点(待复习)