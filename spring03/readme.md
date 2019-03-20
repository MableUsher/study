# AOP #
1. Joinpoint连接点：连接业务和增强方法中的点
2. Pointcut切入点：被增强的方法为切入点，未被增强的是连接点但不是切入点
3. Weaving织入：增强目标对象来创建新的代理对象的过程
4. Proxy代理：被AOP织入过后的类叫代理类
5. Advice通知/增强：前置 后置 异常 最终 环绕
## xmlAOP ##
1. aop:config：声明开始aop的配置
2. aop:aspect：用于配置切面
	* id：给切面提供一个唯一标识
	* ref：引用配置好的通知类bean的id
3. aop:pointcut：用于配置切入点表达式
	* expression：用于定义切入点表达式 
	* execution：指定对哪些类的哪些方法进行增强
4. advice配置
	* 前置通知aop:before
	* 后置通知aop:after-returning
	* 异常通知aop:after-throwing
	* 最终通知aop:after 
5. aop:around环绕

		public Object transactionAround(ProceedingJoinPointpjp) {
			//定义返回值
			Object rtValue = null;
			try {
				//获取方法执行所需的参数
				Object[] args = pjp.getArgs();
				//前置通知：开启事务
				beginTransaction();
				//执行方法
				rtValue = pjp.proceed(args);
				//后置通知：提交事务
				commit();
			}catch(Throwable e) {
				//异常通知：回滚事务
				rollback();
				e.printStackTrace();
			}finally {
				//最终通知：释放资源
				release();
				}
				return rtValue;
		}		
##注解AOP	
1. @Aspect：声明当前类为切面类
2. @Before @AfterReturning@AfterThrowing@After
3. @Around
4. @Pointcut
	* 注解在一个方法上便于通知的ref引用
5. 开启spring对注解AOP的支持：<aop:aspectj-autoproxy/>	
6. 纯注解配置：@EnableAspectJAutoProxy