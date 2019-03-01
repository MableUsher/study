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
		FileInputStream fis = new FileInputStream("壁纸1.jpg");
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		//创建与文件一样大的字节数组
		byte[] arr = new byte[fis.available()];
		//将文件上的字节读取到内存中
		fis.read(arr);
		//将字节数组中的字节数据写到文件上
		fos.write(arr);
		fis.close();
		fos.close();
}
}