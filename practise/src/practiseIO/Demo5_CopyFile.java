package practiseIO;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class Demo5_CopyFile {
	
	public static File getFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ļ���·����");
		while(true) {
			String line = sc.nextLine();
			File file = new File(line);
			if(!file.exists()) {
				System.out.println("��������ļ�·�������ڣ����������룺");
			}else if(file.isDirectory()) {
				System.out.println("����������ļ�·��������������");
			}else {
				return file;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = getFile();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()) );
		
		int b;
		while((b= bis.read() ) != -1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
		
	}

}