package com.mable.test;

import com.mable.dao.AccountDao;
import com.mable.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class testMyBatis {
    @Test
    public void test1() throws Exception{
        //加载mybatis配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);

        List<Account> accounts = dao.findAll();
        for (Account account:accounts
             ) {
            System.out.println(account);
        }
        //释放资源
        session.close();
        in.close();

    }

    @Test
    public void test2() throws Exception{
        //加载mybatis配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);

        Account account = new Account();
        account.setName("usher");
        account.setMoney(400.0);
        dao.saveAccount(account);
        //提交事务
        session.commit();
        //释放资源
        session.close();
        in.close();

    }


}
