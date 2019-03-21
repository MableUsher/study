package com.mable.jdbctemplate;

import com.mable.dao.IAccountDao;
import com.mable.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


/**
 * jdbcTemplate
 */
public class Demo4 {
    public static void main(String[] args) {
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.获取对象
        IAccountDao ad = ac.getBean("accountDao",IAccountDao.class);

        Account account = ad.findAccountById(1);
        System.out.println(account);

        account.setMoney(30000f);
        ad.updateAccount(account);
        ;
    }
}
