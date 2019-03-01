package practiseIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Demo8_test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//
		//创建带缓冲的输出流对象
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		//将读到的字符串转换为int数
		String line = br.readLine();
		int times = Integer.parseInt(line);
		//对int数进行判断，如果大于0，就将其--写回去，如果不大于0，就提示购买正版
		if(times>0) {
			//在if中判断要将--的结果打印，并将结果通过输出流写到文件上
			System.out.println("您还有"+times--+"次机会");
			FileWriter fw = new FileWriter("test.txt");
			fw.write(times +"");
			fw.close();
		}else {
			System.out.println("试用次数已到，请购买正版");
		}
		//关流
		br.close();
	}

}
