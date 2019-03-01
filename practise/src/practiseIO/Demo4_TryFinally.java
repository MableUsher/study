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
		//初始化流防止文件不存在流无法开启关闭
		FileInputStream fis = null;
		FileOutputStream fos = null;
		//用try finally是为了防止读取文件出错流无法读取关闭流命令
		try {
			fis = new FileInputStream("xxx.txt");
			fos = new FileOutputStream("yyy.txt");
			int b;
			while((b = fis.read()) != -1){
				fos.write(b);
			}
		}finally {
			//嵌套目的为尽量关一个流
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
