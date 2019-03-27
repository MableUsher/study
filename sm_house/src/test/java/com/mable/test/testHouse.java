package com.mable.test;

import com.mable.dao.IHouseDao;
import com.mable.domain.House;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:sm-config.xml"})
public class testHouse {
    @Autowired
    @Qualifier(value = "houseMapper")
    private IHouseDao hd;
    @Test
    public void testFindById(){
            System.out.println(hd.findById(3));
        }
    @Test
    public void testSave(){
        House house = new House();
        house.setHousename("万达公馆");
        house.setDistrict("武昌区");
        house.setPrice(458);
        hd.saveHouse(house);
    }
    @Test
    public void testUpdate(){
        House house = hd.findById(3);
        house.setPrice(230);
        hd.updateHouse(house);
    }
    @Test
    public void testDelete(){
        hd.deleteHouse(5);
    }
}
