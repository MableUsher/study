package com.mable.dao;

import com.mable.domain.House;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface HouseDao {
    @Select("select * from house where id=#{id}")
    public House findById(Integer id);
    @Select("select * from house")
    public List<House> findAll();
    @Insert("insert into house (housename,district,price) values(#{housename},#{district},#{price})")
    public void saveHouse(House house);
    @Update("update house set price=#{price} where housename=#{housename}")
    public void updateHouse(House house);
}
