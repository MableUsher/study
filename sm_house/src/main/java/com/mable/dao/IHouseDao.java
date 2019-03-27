package com.mable.dao;

import com.mable.domain.House;
import org.apache.ibatis.annotations.*;

public interface IHouseDao {
        @Select("select * from house where id = #{id}")
        @Results(id = "houseMap", value = {
                @Result(id = true,column = "id",property = "id"),
                @Result(column = "housename",property = "housename"),
                @Result(column = "district",property = "district"),
                @Result(column = "price",property = "price")
        })
        House findById(Integer id);
        @Insert("insert into house(housename,district,price)values(#{housename},#{district},#{price})")
        void saveHouse(House house);
        @Update("update house set housename=#{housename},district=#{district},price=#{price} where id=#{id}")
        void updateHouse(House house);
        @Delete("delete from house where id=#{id}")
        void deleteHouse(Integer id);
    }


