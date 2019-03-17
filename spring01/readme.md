# Spring #
1. 解耦的思路
	* 使用反射来创建对象，而避免使用关键字
	* 通过读取配置文件来获取要创建的对象全限定类名
2. 一个创建bean的工厂
	* 需要一个配置文件来配置Service和Dao<br/>
	  配置的内容：唯一标识=全限定类名(key=value)
	* 通过读取配置文件中配置的内容，反射创建对象
	* 配置文件可以是xml或properties
3. ApplicationContext的三个常用实现类
	* ClassPathXmlApplicationContext<br/>
	可以加载类路径下的配置文件
	* FileSystemXmlApplicationContext<br/>
	可以加载磁盘任意目录下的配置文件
	* AnnotationConfigApplicationContext<br/>
	用于读取注解创建容器	
4. 核心容器的两个接口
	* ApplicationContext 单例对象适用<br/>
	它在构建核心容器时，创建对象采取的策略是立即加载的方式，即一读完文件马上就创建配置文件中配置的对象
	* BeanFactory 多例对象适用<br/>
	采用延迟加载的方式，即什么时候根据id获取对象了，什么时候才真正的创建对象
5. bean对象的生命周期
	* 单例对象<br/>
	出生：当容器创建时出生<br/>
	活着：只要容器存在，对象就活着<br/>
	死亡：容器销毁，对象消亡<br/>
	总结：单例对象的生命周期和容器相同
	* 多例对象<br/>
	出生：当使用对象时spring框架为我们创建<br/>
	活着：对象只要是在使用中就一直活着<br/>
	死亡：当对象长时间不用，且没有别的对象引用时，由java的垃圾回收器回收 
6. 依赖注入：依赖关系的维护
	* 三种能注入的数据<br/>
	基本类型和String<br/>
	其他bean类型(在配置文件中或者注解配置过的bean)<br/>
	复杂类型/集合类型
	* 三种注入的方式<br/>
	使用构造函数提供<br/>
	使用set方法提供<br/>
	使用注解提供
7. 构造函数注入
 	* constructor-arg
 	* 在bean的内部出现
 	* 标签属性<br/>
 	type，index，name用于指定给构造函数中哪个参数赋值<br/>
	value:用于提供基本类型和string类型的数据<br/>
	ref：用于指定其他的bean类型数据，指的是在spring的Ioc容器中出现过的bean对象 
8. set方法注入
	* property
	* bean内部<br/>
	name：用于指定注入时所调用的set方法名称<br/>
	value：用于提供基本类型和String类型的数据<br/>
	ref：用于指定其他的bean类型数据。它指的就是在spring的Ioc核心容器中出现过的bean对象
9. 集合类型注入
	* 用于给List结构集合注入的标签：
            list array set
    * 用于个Map结构集合注入的标签:
            map  props
        结构相同，标签可以互换
