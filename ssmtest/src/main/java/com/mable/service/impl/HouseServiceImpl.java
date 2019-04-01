package com.mable.service.impl;

import com.mable.dao.HouseDao;
import com.mable.domain.House;
import com.mable.service.HouseService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("houseService")
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseDao ad;
    @Override
    public House findById(Integer id) {
        System.out.println("业务层id查询");
        return ad.findById(id);
    }

    @Override
    public List<House> findAll() {
        System.out.println("业务层查询所有");
        return ad.findAll();
    }

    @Override
    public void saveHouse(House house) {
        System.out.println("业务层保存");
        ad.saveHouse(house);
    }

    @Override
    public void updateHouse(House house) {
        System.out.println("业务层更新");
        ad.updateHouse(house);
    }
}
