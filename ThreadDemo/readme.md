# 多线程 #
1. 并行与并发
2. 多线程实现的两种方式
	* 继承Thread
	* 实现Runnable	
3. 匿名内部类实现线程
4. 通过setName(String)方法可以设置线程对象的名字<br/>
   通过getName()方法获取线程对象的名字
5. Thread.currentThread()<br/>获取当前线程的对象
6. Thread.sleep<br/>控制当前线程休眠若干毫秒，可用来检测程序细节
7. setDaemon()<br/>设置一个线程为守护线程,非守护线程结束，它也将结束，但其中会有缓冲时间
8. join(int)<br/>当前线程在暂停, 等待指定的线程在规定时间执行结束后, 当前线程再继续
9. setPriority()<br/>设置线程的优先级，由数字1到10，也可由min和max设置
10. synchronized关键字
	* 当多线程并发, 有多段代码同时执行时, 通过synchronized同步使一段代码执行的过程中，不要切换到其他线程
	* synchronized需要加上一个锁对象，锁对象可以是任意对象,但是被锁的代码需要保证是同一把锁,非静态同步函数的锁是:this，静态的同步函数的锁是:字节码对象（***.class）
11. 单例设计模式
	* 为了保证类在内存中只存在一个对象
	* （1）饿汉式
	* 
			class Singleton {
				//私有构造函数
				private Singleton(){}
				//创建本类对象
				private static Singleton s = new Singleton();
				//提供公共方法
				public static Singleton getInstance() {
					return s;
				}
				
				public static void print() {
					System.out.println("hungry");
				}
			}
	* （2）懒汉式
	* 			
			class Singleton {
				//私有构造函数
				private Singleton(){}
				//声明引用
				private static Singleton s;
				//提供公共方法
				public static Singleton getInstance() {
					if(s == null)
						s = new Singleton();
					return s;
				}
				
				public static void print() {
					System.out.println("lazy");


12. Timer类<br/>计时器，能够实现闹钟提醒的功能，需要调用调用Timer的schedule方法，用以安排指定的任务在指定的时间开始进行重复的固定延迟执行。
	 * schedule(TimerTask task, Date firstTime, long period) ;

13. 使用wait()和notify()控制多个线程的执行规律，两个方法必须在同步代码中执行，需要用同步锁对象来调用 
14. ThreadGroup
	* 用实现Runnable接口的方法
	* 默认调用所有线程都属于一个组
	* 自定义则先创建组对象再当作参数和runnable对象以及线程名一起传入Thread构造方法
15. 设计模式
 	* 定义一个抽象父类，和若干具体子类
	* 简单工厂模式<br/>定义一个工厂，可用于创建一个类所有子类对象，但每个子类需要判定，比较麻烦
	* 工厂方法模式<br/>定义一个创建对象的接口，再定义创建具体对象的工厂类，实现这个接口，由具体类对应具体工厂，如果有新的对象增加，只需要增加一个具体的类和工厂，不用修改代码		