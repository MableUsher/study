package practiseIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1_FlieInputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("test.txt");//����������
		/*
		 * int x = fis.read(); System.out.println(x);
		 */
		/*
		 * ��Ӳ���϶�ȡһ���ֽڣ�readһ��ָ�������һ��
		 * �ļ��Ľ��������-1
		 */
		
		int x;
		while((x = fis.read()) != -1) {
			System.out.println(x);
		}
		fis.close(); 		//�����ͷ���Դ
	
	}

}