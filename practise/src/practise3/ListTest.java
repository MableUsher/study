package practise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListTest {
	/**
	 * 用于存放备选课程的List
	 */
	public List<Course> coursesToSelect;
	private Scanner console;
	public ListTest() {
		this.coursesToSelect = new ArrayList<Course>();
		console = new Scanner(System.in);
			}
	/**
	 * 用于往coursesToSelect中添加备选课程
	 */
	public void TestAdd() {
		//创建一个课程对象，并通过调用add方法，添加到备选课程List中
		Course cr1 = new Course("1","数据结构");
		coursesToSelect.add(cr1);
		System.out.println("添加了课程");
		//Course temp = (Course) coursesToSelect.get(0);
		System.out.println("添加的是："+cr1.id+cr1.name);
		
		Course cr2 = new Course("2","操作系统");
		coursesToSelect.add(1,cr2);
		//Course temp2 = (Course) coursesToSelect.get(1);
		System.out.println("添加的是："+cr2.id+cr2.name);
		
		Course[] course = {new Course("3","离散数学"),new Course("4", "汇编语言")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = coursesToSelect.get(2);
		Course temp4 = (Course) coursesToSelect.get(3);
		System.out.println("添加了两门课程："+temp3.id+temp3.name+";"+temp4.id+temp4.name);
	
		}
		/**
		 * 取得list中元素的方法
		 */
		public void testGet() {
			int size = coursesToSelect.size();
			System.out.println("如下课程待选");
			for(int i=0;i<size;i++) {
				Course cr = (Course) coursesToSelect.get(i);
				System.out.println("课程："+cr.id+":"+cr.name);
			}
		}
		/*
		 * 通过迭代器来遍历list
		 */
		public void testIterator() {
			//通过集合的方法，取得迭代器实例
			Iterator it = coursesToSelect.iterator();
			System.out.println("有如下课程待选（通过迭代器访问）：");
			while(it.hasNext()) {
				Course cr = (Course) it.next();
				System.out.println("课程："+cr.id+":"+cr.name);
			}
		}
			/*
			 * 通过for each方法访问集合元素；			
			 */
		
		public void testForEach() {
			System.out.println("有如下课程待选（通过for each访问）：");
			for(Course cr:coursesToSelect) {
				//Course cr = (Course) obj;
				System.out.println("课程："+cr.id+":"+cr.name);
			}
			System.out.println(coursesToSelect);
		}
		/*
		 * 修改List中的元素
		 */
		public void testModify() {
			coursesToSelect.set(3, new Course("5","毛概"));
		}
		/*
		 * 删除List中的元素
		 */
		public void testRemove() {
			Course cr = (Course) coursesToSelect.get(3);
			System.out.println("我是课程"+cr.id+cr.name+"我即将被删除");
			coursesToSelect.remove(3);
			System.out.println("成功删除课程");
			testForEach();
		}
		public void testListContains(){
			System.out.println("请输入您要查询的课程");
			Scanner console = new Scanner(System.in);
			String newCr = console.next();
			Course cr = new Course();
			cr.name = newCr;
			System.out.println("是否包含课程"+newCr+coursesToSelect.contains(cr));;
			
		}

	public static void main(String[] args) {
		ListTest lt = new ListTest();
		lt.TestAdd();
		lt.testGet();
		lt.testIterator();
		lt.testForEach();
		lt.testModify();
		lt.testForEach();
		lt.testRemove();
		lt.testListContains();
	
	}
}
