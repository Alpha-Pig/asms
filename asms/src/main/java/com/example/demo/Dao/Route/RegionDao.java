package com.example.demo.Dao.Route;

import com.example.demo.Entity.Route.Region;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegionDao {

    public Region findByCity(String city);

    public void AddnewRegion(Region reg);
}

