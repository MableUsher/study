package practiseIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1_FlieInputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("test.txt");//创建流对象
		/*
		 * int x = fis.read(); System.out.println(x);
		 */
		/*
		 * 从硬盘上读取一个字节，read一次指针向后走一次
		 * 文件的结束标记是-1
		 */
		
		int x;
		while((x = fis.read()) != -1) {
			System.out.println(x);
		}
		fis.close(); 		//关流释放资源
	
	}

}
