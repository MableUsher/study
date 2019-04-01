package com.mable.test;

import com.mable.service.HouseService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testService {
    @Test
    public void testFind(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        HouseService hs = (HouseService) ac.getBean("houseService");
        hs.findById(2);
    }
}
