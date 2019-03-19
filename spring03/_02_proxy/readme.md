# 动态代理 #
<br/>
## 基于接口的动态代理 ##
1. Porxy类
	* 代理对象的产生：
*		
		static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
	*      ClassLoader：类加载器
	<br/>           用于加载代理对象字节码的，和被代理对象使用相同的类加载器
	*      Class[]：字节码数组
	<br/> 用于让代理对象和被代理对象有相同方法
	*      InvocationHandler:用于提供增强的代码
	<br/>让我们写如何代理，一般写一个接口的实现类，
	<br/>通常情况下是匿名内部类，但不是必须的
	<br/>此接口的实现类都是谁用谁写
2. new InvocationHandler() {}                    
* 			
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
			return null;
		}
	* 作用：执行被代理对象的任何接口方法都会经过此方法
	* @param proxy 代理对象的引用
	* @param method 当前执行的方法
	* @param args 当前执行方法所需要的参数
	* @return     和被代理对象方法有相同的返回值
	* @throws Throwable

## 基于子类的动态代理 
1. 类：Enhancer
	* 代理对象的产生
*		
		Enhancer.create(Class type Callpack callpack）
	*      Class：字节码
	<br/> 用于用于指定被代理对象的字节码
	*callback:用于提供增强的代码
	<br/> 让我们写如何代理，一般写一个接口的实现类，
	<br/> 通常情况下是匿名内部类，但不是必须的
	<br/> 此接口的实现类都是谁用谁写
	<br/> 我们一般写的都是改接口的子接口实现类：MethodInterceptor
2. new MethodInterceptor
* 
		Enhancer.create(producer.getClass(), new MethodInterceptor() {
		public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
			retun null
		}
		})
	* 作用：执行被代理对象的任何方法都会经过该方法
	* @param proxy
	* @param method
	* @param args
	<br/>以上三个参数和基于接口动态代理invike的参数是一样的
	* @param methodProxy 当前执行方法的代理对象
	* @return
	* @throws Throwable



