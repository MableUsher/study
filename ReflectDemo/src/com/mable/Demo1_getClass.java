package com.mable;


public class Demo1_getClass {
    public static void main(String[] args) {
        //第一种方式获取Class对象
        Student stu1 = new Student();//产生一个Student对象。一个Class对象
        Class stuClass = stu1.getClass();
        System.out.println(stuClass.getName());

        //第二种方式获取Class对象
        Class stuClass2 = Student.class;
        System.out.println(stuClass == stuClass2);//判断前两种方式获取的是否是同一个对象

        //第三种方式获取Class对象
        try {
            Class stuClass3 = Class.forName("Demo1_getClass.Student");
            System.out.println(stuClass == stuClass2);//判断三种方式获得的是否为同一个对象
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


}
