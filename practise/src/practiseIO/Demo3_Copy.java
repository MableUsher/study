package practiseIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_Copy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo2();
		 
		
		
	}

	private static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("��ֽ1.jpg");
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		//�������ļ�һ������ֽ�����
		byte[] arr = new byte[fis.available()];
		//���ļ��ϵ��ֽڶ�ȡ���ڴ���
		fis.read(arr);
		//���ֽ������е��ֽ�����д���ļ���
		fos.write(arr);
		fis.close();
		fos.close();
}
}