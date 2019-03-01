package practiseIO;

import java.io.File;
import java.util.Scanner;


public class Demo9_FileTest {

	public static File getDir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个文件夹路径");
		while(true) {
			//将键盘录入的文件夹路径存储
			String line = sc.nextLine();
			//封装成file对象
			File dir = new File(line);
			if(!dir.exists()) {
				System.out.println("您输入的文件夹路径不存在，请重新输入");
			}else if(dir.isFile()) {
				System.out.println("您输入的是文件路径，请输入文件夹路径");
			}else {
				return dir;
			}
		}
	}
	public static void printJavaFile(File dir) {
		//获取该文件夹路径下的所有的文件和文件夹，存储在File数组中
		File[] subFiles = dir.listFiles();
		//遍历数组，对每一个文件或文件夹做判断
		for (File file : subFiles) {
			//如果是文件，且后缀是.JAVA的就打印
			if(file.isFile() && file.getName().endsWith(".java")) {
				System.out.println(file);
			//如果是文件夹就递归调用
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
