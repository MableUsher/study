package practiseIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Demo8_test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//
		//��������������������
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		//���������ַ���ת��Ϊint��
		String line = br.readLine();
		int times = Integer.parseInt(line);
		//��int�������жϣ��������0���ͽ���--д��ȥ�����������0������ʾ��������
		if(times>0) {
			//��if���ж�Ҫ��--�Ľ����ӡ���������ͨ�������д���ļ���
			System.out.println("������"+times--+"�λ���");
			FileWriter fw = new FileWriter("test.txt");
			fw.write(times +"");
			fw.close();
		}else {
			System.out.println("���ô����ѵ����빺������");
		}
		//����
		br.close();
	}

}