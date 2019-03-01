package practiseIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4_TryFinally {

	public static void main(String[] args) throws IOException {
		//demo1();
		try(
			FileInputStream fis = new FileInputStream("");
		    FileOutputStream fos = new FileOutputStream("");
			){
			int b;
			while((b = fis.read()) != -1) {
				fos.write(b);
			}		
		}
	}

	public static void demo1() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		//��ʼ������ֹ�ļ����������޷������ر�
		FileInputStream fis = null;
		FileOutputStream fos = null;
		//��try finally��Ϊ�˷�ֹ��ȡ�ļ��������޷���ȡ�ر�������
		try {
			fis = new FileInputStream("xxx.txt");
			fos = new FileOutputStream("yyy.txt");
			int b;
			while((b = fis.read()) != -1){
				fos.write(b);
			}
		}finally {
			//Ƕ��Ŀ��Ϊ������һ����
			try {
				if(fis != null)
					fis.close();
			}finally {
				if(fos != null)
					fos.close();
			}
		}
	}

}
