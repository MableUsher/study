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
			System.out.println("������ѧ��ID��");
			String ID = console.next();
			
			if( students.get(ID)== null) {
				System.out.println("������ѧ������");
				String name = console.next();
				Student newStudent = new Student(ID, name);
				students.put(ID, newStudent);
				System.out.println("�ɹ�����ѧ��"+students.get(ID).name);
				i++;
			}else {
				System.out.println("��ѧ��ID�Ѿ���ռ��");
			}
		}
	}
	public void testKeySet() {
		Set<String> keyset = students.keySet();
		System.out.println("�ܹ���"+students.size()+"��ѧ����");
		for (String stuID : keyset) {
			Student stu = students.get(stuID);
			if(stu != null)
				System.out.println("ѧ����"+stu.name);
		}
	}
	public void testEntrySet() {
		Set<Entry<String,Student>> entryset = students.entrySet();
		for (Entry<String, Student> entry : entryset) {
			System.out.println("ȡ�ü���"+entry.getKey());
			System.out.println("��Ӧ��ֵΪ��"+entry.getValue().name);
		}
	}
	/*
	 * ����put�����޸�Map�е�����ӳ��
	 */
	public void testModify() {
		System.out.println("������Ҫ�޸ĵ�ѧ��ID");
		Scanner console = new Scanner(System.in);
		while(true) {
			String stuID = console.next();
			//��students�в���ID��Ӧ��ѧ������
			Student student = students.get(stuID);
			if(student == null) {
				System.out.println("��ѧ�������ڣ�����������");
			continue;
		} 
			System.out.println("��ǰID��Ӧ��ѧ��Ϊ"+student.name);
			System.out.println("�������µ�����:");
			String name = console.next();
			Student newStudent = new Student(stuID,name);
			students.put(stuID, newStudent);
			System.out.println("�޸ĳɹ���");
			break;
	}
	}
	public void testContains() {
		System.out.println("������Ҫ��ѯ��id");
		Scanner console = new Scanner(System.in);
		String ID = console.next();
		System.out.println("�������IDΪ"+ID+students.containsKey(ID));
		if(students.containsKey(ID))			
		System.out.println("��Ӧ��ѧ������Ϊ��"+students.get(ID).name);
		System.out.println("������Ҫ��ѯ��ѧ������");
		String name = console.next();
		if(students.containsValue(new Student(null,name))) {
			System.out.println("��ѧ������");			
	}else {
		System.out.println("��ѧ��������");
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
									