package practise2;
import java.util.Scanner;
public class Library {
 public static void main(String[] args) {
  Index();
 }
 public static String[][] BOOK = {{"0001","语文"},{"0002","数学"},{"0003","英语"},{"0004","体育"}};
 public static void Index() {
  System.out.println("欢迎进入图书馆查书系统\n请输入您的指令:\n1-按名称查找图书\n2-按编号查找图书\n");
  Scanner in = new Scanner(System.in);
  int i = in.nextInt();
  
  try {
   if (i == 1) {
    System.out.println("请输入您需要查找的图书的书名");
    name();
   } else if (i == 2) {
    System.out.println("请输入您需要查找的图书的编号");
    number();
   } else {
    throw new Exception();
   }
  } catch (Exception e) {
   System.out.println("请输入正确指令\n");
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
    System.out.println("编号: " + BOOK[index][0] + "  书名 " + BOOK[index][1] + " 存在");
   } else {
    throw new Exception();
   }
  } catch (Exception e) {
   System.out.println("该书不存在,请重新输入正确书名......");
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
    System.out.println("编号: " + BOOK[index][0] + "  书名 " + BOOK[index][1] + " 存在");
   } else {
    throw new Exception();
   }
  } catch (Exception e) {
   System.out.println("该书不存在，请重新输入正确编号......");
   number();
  }
 }
 
}