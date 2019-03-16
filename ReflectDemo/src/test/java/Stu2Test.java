import Demo.Student2;

import java.lang.reflect.Field;

public class Stu2Test {
    public static void main(String[] args) throws Exception{
        //获取Class对象
        Class stuClass = Class.forName("Demo.Student2");

        System.out.println("获取所有的公有变量");
        Field[] fieldArray = stuClass.getFields();
        for (Field f:fieldArray
             ) {
            System.out.println(f);
        }

        System.out.println("获取所有的变量(包括私有、受保护、默认的)");
        fieldArray = stuClass.getDeclaredFields();
        for (Field f:fieldArray
             ) {
            System.out.println(f);
        }

        System.out.println("获取公有变量并调用");
        Field f = stuClass.getField("name");
        System.out.println(f);
        Object obj = stuClass.getConstructor().newInstance();//产生Stu2对象
        f.set(obj,"Tom");
        Student2 stu = (Student2) obj;
        System.out.println("验证姓名："+stu.name);

        System.out.println("获取私有变量并调用");
        f = stuClass.getDeclaredField("num");
        System.out.println(f);
        f.setAccessible(true);//暴力反射，解除私有限定
        f.set(obj,"1507222222");
        System.out.println("验证号码"+stu);
    }
}
