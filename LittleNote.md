1. super():
	* 如果子类的构造方法中没有显示调用父类的构造方法，则系统会默认调用父类无参的构造方法。
	
	* 如果显示的调用构造方法，则必须写在子类的构造方法的第一行；
	
	* 如果子类构造方法中既没有显示调用父类的构造方法，而父类又没有无参的构造方法，则编译错误

2. 参数出了这个方法，这个参数的改变就消失了。
比如你传了2个int值 a，b进去想要让他们交换数值，是在函数里面他们值是交换的，但是出了函数，还是原来各自的值。
因为对于基本类型，java是把他们的值传进去了，比如你原来的a是某个元素的属性，比如是5，他只是把5这个数复制一份传过去了，
这5只是个数字，并不指向a的属性,你的改动是不会影响到a的属性的对非基本类型，你在函数里的更改可以影响外面是因为直接把那个对象传进去了，改的是那个对象  

3. foreach		
 		        
		        for(int each : nuns)
			{
				   each .....
				}
这里的 each 只是把 nums 数组中每一个元素的值拷贝了一份，也就是这样的：int each = nums[0];
之后对 each 的所有赋值都是赋值给了 each，而不是 nums[0]；

4. .equals和hashCode的方法重写应写在相应类下。 

5. TreeSet的自然排序功能能让它给排序困难的Map表排序。

6. ？extent e泛型固定下边界<br/> ？super e泛型固定上边界