package practise3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.*;

public class MapTest {
	public Map<String,Student>students;
	public MapTest() {
		this.students = new HashMap<String,Student>();
	}
	public void testPut() {
		Scanner console = new Scanner(System.in);
		int i = 0;
		while(i<3){
			System.out.println("请输入学生ID：");
			String ID = console.next();
			
			if( students.get(ID)== null) {
				System.out.println("请输入学生姓名");
				String name = console.next();
				Student newStudent = new Student(ID, name);
				students.put(ID, newStudent);
				System.out.println("成功添加学生"+students.get(ID).name);
				i++;
			}else {
				System.out.println("该学生ID已经被占用");
			}
		}
	}
	public void testKeySet() {
		Set<String> keyset = students.keySet();
		System.out.println("总共有"+students.size()+"个学生！");
		for (String stuID : keyset) {
			Student stu = students.get(stuID);
			if(stu != null)
				System.out.println("学生："+stu.name);
		}
	}
	public void testEntrySet() {
		Set<Entry<String,Student>> entryset = students.entrySet();
		for (Entry<String, Student> entry : entryset) {
			System.out.println("取得键："+entry.getKey());
			System.out.println("对应的值为："+entry.getValue().name);
		}
	}
	/*
	 * 利用put方法修改Map中的已有映射
	 */
	public void testModify() {
		System.out.println("请输入要修改的学生ID");
		Scanner console = new Scanner(System.in);
		while(true) {
			String stuID = console.next();
			//从students中查找ID对应的学生对象
			Student student = students.get(stuID);
			if(student == null) {
				System.out.println("该学生不存在，请重新输入");
			continue;
		} 
			System.out.println("当前ID对应的学生为"+student.name);
			System.out.println("请输入新的姓名:");
			String name = console.next();
			Student newStudent = new Student(stuID,name);
			students.put(stuID, newStudent);
			System.out.println("修改成功！");
			break;
	}
	}
	public void testContains() {
		System.out.println("请输入要查询的id");
		Scanner console = new Scanner(System.in);
		String ID = console.next();
		System.out.println("您输入的ID为"+ID+students.containsKey(ID));
		if(students.containsKey(ID))			
		System.out.println("对应的学生姓名为："+students.get(ID).name);
		System.out.println("请输入要查询的学生姓名");
		String name = console.next();
		if(students.containsValue(new Student(null,name))) {
			System.out.println("该学生存在");			
	}else {
		System.out.println("该学生不存在");
	}
	}
	public static void main(String[] args) {
	MapTest mt = new MapTest();	
	mt.testPut();
	mt.testKeySet();
	//mt.testEntrySet();
	mt.testModify();
	mt.testEntrySet();
	mt.testContains();
}
}
									