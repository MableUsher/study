package practiseIO;

import java.io.File;
import java.util.Scanner;


public class Demo9_FileTest {

	public static File getDir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ļ���·��");
		while(true) {
			//������¼����ļ���·���洢
			String line = sc.nextLine();
			//��װ��file����
			File dir = new File(line);
			if(!dir.exists()) {
				System.out.println("��������ļ���·�������ڣ�����������");
			}else if(dir.isFile()) {
				System.out.println("����������ļ�·�����������ļ���·��");
			}else {
				return dir;
			}
		}
	}
	public static void printJavaFile(File dir) {
		//��ȡ���ļ���·���µ����е��ļ����ļ��У��洢��File������
		File[] subFiles = dir.listFiles();
		//�������飬��ÿһ���ļ����ļ������ж�
		for (File file : subFiles) {
			//������ļ����Һ�׺��.JAVA�ľʹ�ӡ
			if(file.isFile() && file.getName().endsWith(".java")) {
				System.out.println(file);
			//������ļ��о͵ݹ����
			}else if(file.isDirectory()) 
				printJavaFile(file);
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = getDir();
		printJavaFile(dir); 
	}

}
