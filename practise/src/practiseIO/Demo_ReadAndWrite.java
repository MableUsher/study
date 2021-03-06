package practiseIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo_ReadAndWrite {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数据：");
		//创建输出流对象，关联text.txt文件
		FileOutputStream fos = new FileOutputStream("test.txt");
		//定义无限循环
		while(true) {
			String line = sc.nextLine(); //将键盘录入的数据存储在line中
			//遇到quit退出循环
			if("quit".equals(line))
				break;
		
			//如果不quit，将内容写出
			fos.write(line.getBytes());
			fos.write("\r\n".getBytes());
		}
		//关流
		fos.close();
	}

}
