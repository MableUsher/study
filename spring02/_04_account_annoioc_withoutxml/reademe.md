# spring注解配置 #
1. 通过@Configuration创建配置类，取代bean.xml文件的存在
2. 通过@ComponentScan取代xml扫描包配置
3. 通过bean注解自写的获得对象方法来取代xml中queryrunner和datasource配置
4. 用AnnotationConfigApplicationContext注解方法取代xml配置的ClassPathXml方法
5. 用@Import将配置类分层，同时可省略@Configuration
6. 用@PropertySource 将复杂注解类，抽出为一个配置文件，再注解properties配置文件地址