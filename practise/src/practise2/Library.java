package practise2;
import java.util.Scanner;
public class Library {
 public static void main(String[] args) {
  Index();
 }
 public static String[][] BOOK = {{"0001","����"},{"0002","��ѧ"},{"0003","Ӣ��"},{"0004","����"}};
 public static void Index() {
  System.out.println("��ӭ����ͼ��ݲ���ϵͳ\n����������ָ��:\n1-�����Ʋ���ͼ��\n2-����Ų���ͼ��\n");
  Scanner in = new Scanner(System.in);
  int i = in.nextInt();
  
  try {
   if (i == 1) {
    System.out.println("����������Ҫ���ҵ�ͼ�������");
    name();
   } else if (i == 2) {
    System.out.println("����������Ҫ���ҵ�ͼ��ı��");
    number();
   } else {
    throw new Exception();
   }
  } catch (Exception e) {
   System.out.println("��������ȷָ��\n");
   Index();
  }
 }
 
 public static void name() {
  Scanner in = new Scanner(System.in);
  String str = in.nextLine();
  int index = -1;
  try {
   for (int i = 0; i < BOOK.length; i++) {
    if (BOOK[i][1].equals(str)) {
     index = i;
     break;
    }
   }
   if (index != -1) {
    System.out.println("���: " + BOOK[index][0] + "  ���� " + BOOK[index][1] + " ����");
   } else {
    throw new Exception();
   }
  } catch (Exception e) {
   System.out.println("���鲻����,������������ȷ����......");
   name();
  }
 }
 
 public static void number() {
  Scanner in = new Scanner(System.in);
  String str = in.nextLine();
  int index = -1;
  try {
   for (int i = 0; i < BOOK.length; i++) {
    if (BOOK[i][0].equals(str)) {
     index = i;
     break;
    }
   }
   if (index != -1) {
    System.out.println("���: " + BOOK[index][0] + "  ���� " + BOOK[index][1] + " ����");
   } else {
    throw new Exception();
   }
  } catch (Exception e) {
   System.out.println("���鲻���ڣ�������������ȷ���......");
   number();
  }
 }
 
}