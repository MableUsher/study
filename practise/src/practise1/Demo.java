package practise1;
import java.util.Scanner;
public class Demo {
public static void main(String[] args) {
	Scanner input=new Scanner (System.in);
	int classNum = 2;
	int stuNum = 3;
	double sum = 0;
	double avg = 0;
	for(int i=1;i<=classNum;i++) {
		System.out.println("这是"+i+"班的");
		for(int j=1;j<=stuNum;j++) {
			
			System.out.print("输入第"+j+"个人的成绩");
			int score = input.nextInt();
			sum+=score;
		}
		avg = sum/stuNum;
		System.out.println("班上的人的平均分是"+avg);
		sum=0;
	}
}
}
