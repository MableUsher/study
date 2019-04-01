package com.mable.service;

import com.mable.domain.House;

import java.util.List;

public interface HouseService {
    public House findById(Integer id);
    public List<House> findAll();
    public void saveHouse(House house);
    public void updateHouse(House house);
}
