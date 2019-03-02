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
		//����һ���γ̶��󣬲�ͨ������add���������ӵ���ѡ�γ�List��
		Course cr1 = new Course("1","���ݽṹ");
		coursesToSelect.add(cr1);
		System.out.println("���ӵ��ǣ�"+cr1.id+cr1.name);
		
		Course cr2 = new Course("2","����ϵͳ");
		coursesToSelect.add(1,cr2);		
		System.out.println("���ӵ��ǣ�"+cr2.id+cr2.name);
		
		Course[] course = {new Course("3","��ɢ��ѧ"),new Course("4", "�������")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = coursesToSelect.get(2);
		Course temp4 = (Course) coursesToSelect.get(3);
		System.out.println("���������ſγ̣�"+temp3.id+temp3.name+";"+temp4.id+temp4.name);	
		}
	public void testForEach() {
		System.out.println("�����¿γ̴�ѡ��ͨ��for each���ʣ���");
		for(Course cr:coursesToSelect) {
			System.out.println("�γ̣�"+cr.id+":"+cr.name);
		}
	}
	//��ӡ���set����ѧ����ѡ�Ŀγ̣�
	public void testForEachForSet(Student stu) {
		for (Course cr : stu.courses) {
			System.out.println("ѡ���˿γ�"+cr.id+":"+cr.name);
		}
	}
	public void testSetContains() {
		
		Student stu = new Student("1", "С��");
		System.out.println("��ӭѧ����"+stu.name+"ѡ�Σ�");
		//����һ��Scanner�����������մӼ�������Ŀγ�ID
		Scanner console = new Scanner(System.in);
		//������ѡ�γ̣������յļ�������ID�뱸ѡ�γ̽��бȽ�ƥ�䣬���ӿγ���setѧ��ѡ�α�
		for(int i=0;i<4;i++) {
			System.out.println("������γ�ID");
			String courseId = console.next();
			for (Course cr : coursesToSelect) {
				if(cr.id.equals(courseId)) {
					stu.courses.add(cr);
				}
			}
		}System.out.println("������Ҫ��ѯ�Ŀγ�����");
		Scanner console2 = new Scanner(System.in);
		String crname = console2.next();
		Course cr = new Course();
		cr.name = crname;
		
		System.out.println("��Ҫ��ѯ�Ŀγ������ǣ�"+
		crname+stu.courses.contains(cr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetTest st = new SetTest();
		st.TestAdd();
		st.testForEach();
		//����һ��ѧ������
		Student stu = new Student("1", "С��");
		System.out.println("��ӭѧ����"+stu.name+"ѡ�Σ�");
		//����һ��Scanner�����������մӼ�������Ŀγ�ID
		Scanner console = new Scanner(System.in);
		//������ѡ�γ̣������յļ�������ID�뱸ѡ�γ̽��бȽ�ƥ�䣬���ӿγ���setѧ��ѡ�α�
		for(int i=0;i<4;i++) {
			System.out.println("������γ�ID");
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