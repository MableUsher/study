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