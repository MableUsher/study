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
		System.out.println("����"+i+"���");
		for(int j=1;j<=stuNum;j++) {
			
			System.out.print("�����"+j+"���˵ĳɼ�");
			int score = input.nextInt();
			sum+=score;
		}
		avg = sum/stuNum;
		System.out.println("���ϵ��˵�ƽ������"+avg);
		sum=0;
	}
}
}