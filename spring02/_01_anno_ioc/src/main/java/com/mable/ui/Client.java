package com.mable.ui;



import com.mable.dao.IAccountDao;
import com.mable.service.IAccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {
    /**
     * 获取spring容器的ioc核心容器，并根据id获取对象
     * @param args
     */
    public static void main(String[] args) {
        //-------------ApplicationContext-----------
        //1.获取核心容器对象
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取bean对象
        IAccountService as = (IAccountService) ac.getBean("accountService");
        System.out.println(as);
        as.saveAccount();
        IAccountDao ad = (IAccountDao) ac.getBean("accountDao");
        System.out.println(ad);
        ad.saveAccount();
        ac.close();
    }
}