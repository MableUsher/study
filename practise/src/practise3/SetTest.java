package practise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Scanner;

public class SetTest {
	public List<Course>coursesToSelect;
	public SetTest() {
		coursesToSelect = new ArrayList<Course>();
	}
	public void TestAdd() {
		//创建一个课程对象，并通过调用add方法，添加到备选课程List中
		Course cr1 = new Course("1","数据结构");
		coursesToSelect.add(cr1);
		System.out.println("添加的是："+cr1.id+cr1.name);
		
		Course cr2 = new Course("2","操作系统");
		coursesToSelect.add(1,cr2);		
		System.out.println("添加的是："+cr2.id+cr2.name);
		
		Course[] course = {new Course("3","离散数学"),new Course("4", "汇编语言")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = coursesToSelect.get(2);
		Course temp4 = (Course) coursesToSelect.get(3);
		System.out.println("添加了两门课程："+temp3.id+temp3.name+";"+temp4.id+temp4.name);	
		}
	public void testForEach() {
		System.out.println("有如下课程待选（通过for each访问）：");
		for(Course cr:coursesToSelect) {
			System.out.println("课程："+cr.id+":"+cr.name);
		}
	}
	//打印输出set表中学生所选的课程！
	public void testForEachForSet(Student stu) {
		for (Course cr : stu.courses) {
			System.out.println("选择了课程"+cr.id+":"+cr.name);
		}
	}
	public void testSetContains() {
		
		Student stu = new Student("1", "小明");
		System.out.println("欢迎学生："+stu.name+"选课！");
		//创建一个Scanner对象，用来接收从键盘输入的课程ID
		Scanner console = new Scanner(System.in);
		//遍历备选课程，将接收的键盘输入ID与备选课程进行比较匹配，添加课程至set学生选课表
		for(int i=0;i<4;i++) {
			System.out.println("请输入课程ID");
			String courseId = console.next();
			for (Course cr : coursesToSelect) {
				if(cr.id.equals(courseId)) {
					stu.courses.add(cr);
				}
			}
		}System.out.println("请输入要查询的课程名称");
		Scanner console2 = new Scanner(System.in);
		String crname = console2.next();
		Course cr = new Course();
		cr.name = crname;
		
		System.out.println("您要查询的课程名称是："+
		crname+stu.courses.contains(cr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetTest st = new SetTest();
		st.TestAdd();
		st.testForEach();
		//创建一个学生对象
		Student stu = new Student("1", "小明");
		System.out.println("欢迎学生："+stu.name+"选课！");
		//创建一个Scanner对象，用来接收从键盘输入的课程ID
		Scanner console = new Scanner(System.in);
		//遍历备选课程，将接收的键盘输入ID与备选课程进行比较匹配，添加课程至set学生选课表
		for(int i=0;i<4;i++) {
			System.out.println("请输入课程ID");
			String courseId = console.next();
			for (Course cr : st.coursesToSelect) {
				if(cr.id.equals(courseId)) {
					stu.courses.add(cr);
				}
			}
		}
		st.testForEachForSet(stu);
		st.testSetContains();
	}

}
