package practise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListTest {
	/**
	 * ���ڴ�ű�ѡ�γ̵�List
	 */
	public List<Course> coursesToSelect;
	private Scanner console;
	public ListTest() {
		this.coursesToSelect = new ArrayList<Course>();
		console = new Scanner(System.in);
			}
	/**
	 * ������coursesToSelect�����ӱ�ѡ�γ�
	 */
	public void TestAdd() {
		//����һ���γ̶��󣬲�ͨ������add���������ӵ���ѡ�γ�List��
		Course cr1 = new Course("1","���ݽṹ");
		coursesToSelect.add(cr1);
		System.out.println("�����˿γ�");
		//Course temp = (Course) coursesToSelect.get(0);
		System.out.println("���ӵ��ǣ�"+cr1.id+cr1.name);
		
		Course cr2 = new Course("2","����ϵͳ");
		coursesToSelect.add(1,cr2);
		//Course temp2 = (Course) coursesToSelect.get(1);
		System.out.println("���ӵ��ǣ�"+cr2.id+cr2.name);
		
		Course[] course = {new Course("3","��ɢ��ѧ"),new Course("4", "�������")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = coursesToSelect.get(2);
		Course temp4 = (Course) coursesToSelect.get(3);
		System.out.println("���������ſγ̣�"+temp3.id+temp3.name+";"+temp4.id+temp4.name);
	
		}
		/**
		 * ȡ��list��Ԫ�صķ���
		 */
		public void testGet() {
			int size = coursesToSelect.size();
			System.out.println("���¿γ̴�ѡ");
			for(int i=0;i<size;i++) {
				Course cr = (Course) coursesToSelect.get(i);
				System.out.println("�γ̣�"+cr.id+":"+cr.name);
			}
		}
		/*
		 * ͨ��������������list
		 */
		public void testIterator() {
			//ͨ�����ϵķ�����ȡ�õ�����ʵ��
			Iterator it = coursesToSelect.iterator();
			System.out.println("�����¿γ̴�ѡ��ͨ�����������ʣ���");
			while(it.hasNext()) {
				Course cr = (Course) it.next();
				System.out.println("�γ̣�"+cr.id+":"+cr.name);
			}
		}
			/*
			 * ͨ��for each�������ʼ���Ԫ�أ�			
			 */
		
		public void testForEach() {
			System.out.println("�����¿γ̴�ѡ��ͨ��for each���ʣ���");
			for(Course cr:coursesToSelect) {
				//Course cr = (Course) obj;
				System.out.println("�γ̣�"+cr.id+":"+cr.name);
			}
			System.out.println(coursesToSelect);
		}
		/*
		 * �޸�List�е�Ԫ��
		 */
		public void testModify() {
			coursesToSelect.set(3, new Course("5","ë��"));
		}
		/*
		 * ɾ��List�е�Ԫ��
		 */
		public void testRemove() {
			Course cr = (Course) coursesToSelect.get(3);
			System.out.println("���ǿγ�"+cr.id+cr.name+"�Ҽ�����ɾ��");
			coursesToSelect.remove(3);
			System.out.println("�ɹ�ɾ���γ�");
			testForEach();
		}
		public void testListContains(){
			System.out.println("��������Ҫ��ѯ�Ŀγ�");
			Scanner console = new Scanner(System.in);
			String newCr = console.next();
			Course cr = new Course();
			cr.name = newCr;
			System.out.println("�Ƿ�����γ�"+newCr+coursesToSelect.contains(cr));;
			
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