package com.example.demo.Dao.Route;


import com.example.demo.Entity.Route.stops;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface StopDao {
    public void addstop(stops stop);
    public void addrefresh(Map<String, Object> map);
    public void delete(Map<String, Object> map);
    public void delrefresh(Map<String, Object> map);
}
