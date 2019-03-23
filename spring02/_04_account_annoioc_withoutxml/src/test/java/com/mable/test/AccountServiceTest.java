package com.mable.test;

import com.mable.domain.Account;
import com.mable.service.IAccountService;
import config.SpringConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 使用Junit单元测试，测试我们的配置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class AccountServiceTest {
   // private ApplicationContext ac;
    @Autowired
    private IAccountService as = null;
  /*  @Before
    public void init(){
        ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        as = ac.getBean("Service",IAccountService.class);
    }*/
    @Test
    public void testFindAll() {
       // ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        //IAccountService as = ac.getBean("Service",IAccountService.class);
        List<Account> accounts = as.findAllAccount();
        for (Account account:accounts
             ) {
            System.out.println(account);
        }
    }
    @Test
    public void testFindOne() {
      /*  ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService",IAccountService.class);*/
        Account account = as.findAccountById(1);
        System.out.println(account);
    }
    @Test
    public void testSave() {
        Account account = new Account();
        account.setName("test");
        account.setMoney(30000f);
/*        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService",IAccountService.class);*/
        as.saveAccount(account);
    }
    @Test
    public void testUpdate() {
  /*      ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService",IAccountService.class);*/
        Account account  = as.findAccountById(6);
        account.setMoney(20000f);
        as.updateAccount(account);
    }
    @Test
    public void testDelete() {
     /*   ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService",IAccountService.class);*/
        as.deleteAccount(6);
    }


}
