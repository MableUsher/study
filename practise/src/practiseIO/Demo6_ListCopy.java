package practiseIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Demo6_ListCopy {
		/*
		 * ��������������� 
		 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//�����������������
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		//BufferedWriter bw = new BufferedWriter(new FileWriter("revxx.txt"));
		//�������϶���
		ArrayList<String> list = new ArrayList<String>();
		//�����������ݴ洢�ڼ�����
		String line;
		while((line = br.readLine()) != null) {
			list.add(line);
		}
		br.close();
		//�������������д���ļ���
		BufferedWriter bw = new BufferedWriter(new FileWriter("revxx.txt"));
		for (int i = list.size()-1; i >=0; i--) {
			bw.write(list.get(i));
			bw.newLine();
		}
		//����
		//br.close;
		bw.close();
	}

}