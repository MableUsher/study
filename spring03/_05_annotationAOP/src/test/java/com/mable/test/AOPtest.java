package com.mable.test;

import com.mable.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPtest {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(com.mable.utils.logger.class);
        IAccountService as = (IAccountService) ac.getBean("accountService");
        as.saveAccount();

    }
}
