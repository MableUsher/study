package practise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
	/*
	 * ͨ�õĿ��Ʒ���(�����б�Ϊ�������Լ����ƺ��������)
	 */
	public static void  lookPoker(HashMap<Integer, String>poker,TreeSet<Integer>ts,String name) {
			System.out.println(name+"�����ƣ�");
			//ͨ������TreeSet����ȡÿ���˵�"����"����������Map�ж�Ӧ����ʵ��ֵȡ������ӡ
			for (Integer i :ts) {
				System.out.print(poker.get(i));
			}
			System.out.println();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ���˿�
		String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String[] color = {"����","����","÷��","����",};
		//Map�����洢���е���
		HashMap<Integer, String> poker = new HashMap<Integer, String>();
		//List������������Ա�����
		ArrayList<Integer> list = new ArrayList<Integer>();
		//��ʼ������ֵ
		int index = 0;
		//���ƵĴ�С����������洢��Map��ͬʱ����������List
		for (String string : num) {
			for (String string2 :color) {
				poker.put(index, (string.concat(string2)));
				list.add(index);
				index++;
			}
		}
		//���Ӵ�С���Լ�����
		poker.put(index,"С��");
		index++;
		list.add(index);
		poker.put(index,"����");
		list.add(index);
		//ϴ��
		Collections.shuffle(list);
		//��ӡһ���˿�
		System.out.println("������һ���˿��ƣ�"+poker);
		//�����������(��TreeSet�洢�����Ա�����)
		TreeSet<Integer> tom = new TreeSet<Integer>();
		TreeSet<Integer> jerry = new TreeSet<Integer>();
		TreeSet<Integer> mike = new TreeSet<Integer>();
		TreeSet<Integer> lastThree = new TreeSet<Integer>();
		//����(���ŵ����ƶ�Ӧ������ֵ�����Ʊ���)
		for(int i=0;i<poker.size();i++) {			
			if(i>=poker.size()-3) {
			lastThree.add(list.get(i));
		}else if(i % 3 == 0) {
			tom.add(list.get(i));
		}else if(i % 3 == 1) {
			jerry.add(list.get(i));
		}else  {
			mike.add(list.get(i));
		}
	}
		//����
		lookPoker(poker, tom, "tom");
		lookPoker(poker, jerry, "jerry");
		lookPoker(poker, mike, "mike");
		lookPoker(poker, lastThree, "lastThree");
}
}