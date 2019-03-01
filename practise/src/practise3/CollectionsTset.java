package practise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class CollectionsTset {

	public void testSort() {
		List<Integer> integerList = new ArrayList<Integer>();
		Random random = new Random();
		Integer k;
		for(int i=0;i<10;i++) {
			do {
				 k = random.nextInt(100);
			}while(integerList.contains(k));
			integerList.add(k);
		}
		Collections.sort(integerList);
		for (Integer integer : integerList) {
			System.out.println(integer);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CollectionsTset ct = new  CollectionsTset();
		 ct.testSort();
	}

}
