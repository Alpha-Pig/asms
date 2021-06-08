package com.example.demo.Dao.Route;
import com.example.demo.Entity.Route.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RouteDao {

   public void Addroute(routes route);

   public void deleteroute(int route_id);

   public routes FindrouteByRid(int route_id);

   public void AddStop_toroute(int route_id, int stepnumber, String stepname);

   public void Deletestop_toroute(int route_id, int stepnumber);

}
