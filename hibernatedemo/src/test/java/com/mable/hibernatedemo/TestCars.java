package com.mable.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestCars {
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    //开始测试
    @Before
    public void init(){
        //创建会话工厂
        sessionFactory = new Configuration().configure().buildSessionFactory();
        //开启会话
        session = sessionFactory.openSession();
        //开启事务
        transaction = session.beginTransaction();
    }
    @After
    public void destroy(){
        //关闭事务
        transaction.commit();
        //关闭对话
        session.close();
        //关闭会话工厂
        sessionFactory.close();

    }
    @Test
    public void testCars(){
        CarsEntity car = new CarsEntity();
        car.setId(750);
        car.setName("BMW");
        CarsEntity car2 = new CarsEntity();
        car2.setName("Benz");
        car2.setId(600);
        session.save(car);
        session.save(car2);
    }
}
