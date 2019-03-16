import Demo.Student;

import java.lang.reflect.Constructor;

public class StuTest {
    public static void main(String[] args) throws Exception {
        //1.加载Class对象
        Class cl = Student.class;
        //2.获取所有公有构造方法
        System.out.println("所有公有构造方法");
        Constructor[] conArray = cl.getConstructors();
        for (Constructor c:conArray
             ) {
            System.out.println(c);
        }
        //3.获取所有类型构造方法
        System.out.println("所有的构造方法(包括：私有、受保护、默认、公有)");
        conArray = cl.getDeclaredConstructors();
        for(Constructor c : conArray
            ) {
            System.out.println(c);
        }
        //4.获取公有无参构造方法
        System.out.println("获取公有、无参的构造方法");
        Constructor con = cl.getConstructor(null);
        System.out.println("con = " + con);
        //调用构造方法
        Object obj = con.newInstance();
        //	System.out.println("obj = " + obj);
        //	Student stu = (Student)obj;

        //5.获取私有构造方法
        System.out.println("获取私有构造方法，并调用");
        con = cl.getDeclaredConstructor(int.class);
        System.out.println(con);
        //调用构造方法
        con.setAccessible(true);//暴力访问(忽略掉访问修饰符)
        obj = con.newInstance(23);
    }

}

