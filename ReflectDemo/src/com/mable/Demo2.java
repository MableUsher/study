package com.mable;

import com.sun.tools.javac.Main;

public class Demo2 {
    public class Student{
        //默认的构造方法
        Student(String str){
            System.out.println("默认的构造方法 s = "+str);
        }
        //无参的构造方法
        public Student(){
            System.out.println("调用公有的无参构造方法");
        }
        //有一个参数的构造方法
        public Student(char name){
            System.out.println("姓名："+name);
        }
        //有多个参数的构造方法
        public Student(String name,int age){
            System.out.println("姓名："+name+"年龄:"+age);
        }
        //受保护的构造方法
        protected Student(boolean n){
            System.out.println("受保护的构造方法 n = "+n);
        }
        //私有的构造方法
        private Student(int age){
            System.out.println("私有的构造方法 age = "+age);
        }
    }

    public static void main(String[] args) {

    }
}
