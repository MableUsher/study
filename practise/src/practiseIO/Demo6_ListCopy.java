package practiseIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Demo6_ListCopy {
		/*
		 * 流对象尽量晚开早关 
		 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建输入输出流对象
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		//BufferedWriter bw = new BufferedWriter(new FileWriter("revxx.txt"));
		//创建集合对象
		ArrayList<String> list = new ArrayList<String>();
		//将读到的数据存储在集合中
		String line;
		while((line = br.readLine()) != null) {
			list.add(line);
		}
		br.close();
		//反向遍历将数据写到文件上
		BufferedWriter bw = new BufferedWriter(new FileWriter("revxx.txt"));
		for (int i = list.size()-1; i >=0; i--) {
			bw.write(list.get(i));
			bw.newLine();
		}
		//关流
		//br.close;
		bw.close();
	}

}
