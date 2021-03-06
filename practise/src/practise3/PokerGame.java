package practise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
	/*
	 * 通用的看牌方法(参数列表为整副牌以及手牌和玩家姓名)
	 */
	public static void  lookPoker(HashMap<Integer, String>poker,TreeSet<Integer>ts,String name) {
			System.out.println(name+"的手牌：");
			//通过遍历TreeSet表获取每个人的"手牌"，并将其在Map中对应的真实牌值取出并打印
			for (Integer i :ts) {
				System.out.print(poker.get(i));
			}
			System.out.println();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一副扑克
		String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String[] color = {"红桃","黑桃","梅花","方块",};
		//Map用来存储所有的牌
		HashMap<Integer, String> poker = new HashMap<Integer, String>();
		//List用来存放索引以便排序
		ArrayList<Integer> list = new ArrayList<Integer>();
		//初始化索引值
		int index = 0;
		//按牌的大小遍历并按序存储进Map，同时将索引存入List
		for (String string : num) {
			for (String string2 :color) {
				poker.put(index, (string.concat(string2)));
				list.add(index);
				index++;
			}
		}
		//添加大小王以及索引
		poker.put(index,"小王");
		index++;
		list.add(index);
		poker.put(index,"大王");
		list.add(index);
		//洗牌
		Collections.shuffle(list);
		//打印一副扑克
		System.out.println("桌上有一副扑克牌："+poker);
		//创建三个玩家(用TreeSet存储索引以便排序)
		TreeSet<Integer> tom = new TreeSet<Integer>();
		TreeSet<Integer> jerry = new TreeSet<Integer>();
		TreeSet<Integer> mike = new TreeSet<Integer>();
		TreeSet<Integer> lastThree = new TreeSet<Integer>();
		//发牌(发放的是牌对应的索引值而非牌本身)
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
		//看牌
		lookPoker(poker, tom, "tom");
		lookPoker(poker, jerry, "jerry");
		lookPoker(poker, mike, "mike");
		lookPoker(poker, lastThree, "lastThree");
}
}
