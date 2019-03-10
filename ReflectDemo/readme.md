# 反射 #
1. 反射就是把java类中的各种成分映射成一个个的Java对象
2. 使用的前提条件：必须先得到代表的字节码的Class，Class类用于表示.class文件
3. 三种获取Class对象的方式
	* Object ——> getClass();
	
			Student stu1 = new Student();//这一new 产生一个Student对象，一个Class对象。<br/>
			Class stuClass = stu1.getClass();//获取Class对象<br/>
			System.out.println(stuClass.getName());
	* 任何数据类型（包括基本数据类型）都有一个“静态”的class属性<
	* 
			Class stuClass2 = Student.class;<br/>
			System.out.println(stuClass == stuClass2);
 	* 通过Class类的静态方法：forName（String  className）(常用)
 	* 
			Class stuClass3 = Class.forName("fanshe.Student");<br/>//注意此字符串必须是真实路径，就是带包名的类路径，包名.类名<br/>
			System.out.println(stuClass3 == stuClass2);
4. 通过反射获取构造方法
	* getConstructor() 
	* 调用：Constructor-->newInstance(Object... initargs)<br/>
	使用此 Constructor 对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例。<br/>
	它的返回值是T类型，所以newInstance是创建了一个构造方法的声明类的新实例对象。并为之调用
5. 通过反射获取成员变量并调用
	* getField()
	* 调用：Object obj = stuClass.getConstructor().newInstance();产生Student对象
	* f.set(obj, "Tom");<br/>为Student对象中的name属性赋值，第一个参数：要传入设置的对象，第二个参数：要传入实参
6. 通过反射获取成员方法并调用
	* getMethod(方法名称，形参类型.class)
	* setAccessible(true)解除私有限定，暴力访问
	* 调用：.invoke(obj,实参)
	*   		       
			Object obj = stuClass.getConstructor().newInstance();
	    	Object result = m.invoke(obj, 20);
	    	System.out.println("返回值：" + result);
7. 反射main方法
	*  
			Method methodMain = clazz.getMethod("main", String[].class);
	* 调用：
	* 
			methodMain.invoke(null, (Object)new String[]{"a","b","c"});
8. 通过反射越过泛型检查
	* 		  	
			ArrayList<String> strList = new ArrayList<>();
			strList.add("aaa");
			strList.add("bbb");
			
			//strList.add(100);
			//获取ArrayList的Class对象，反向的调用add()方法，添加数据
			Class listClass = strList.getClass(); //得到 strList 对象的字节码 对象
			//获取add()方法
			Method m = listClass.getMethod("add", Object.class);
			//调用add()方法
			m.invoke(strList, 100);
			
			//遍历集合
			for(Object obj : strList){
				System.out.println(obj);
			控制台输出：
			aaa
			bbb
			100

