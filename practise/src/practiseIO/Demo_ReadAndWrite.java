package practiseIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo_ReadAndWrite {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ݣ�");
		//������������󣬹���text.txt�ļ�
		FileOutputStream fos = new FileOutputStream("test.txt");
		//��������ѭ��
		while(true) {
			String line = sc.nextLine(); //������¼������ݴ洢��line��
			//����quit�˳�ѭ��
			if("quit".equals(line))
				break;
		
			//�����quit��������д��
			fos.write(line.getBytes());
			fos.write("\r\n".getBytes());
		}
		//����
		fos.close();
	}

}
