package com.example.demo.Service.Route.lmpl;


import com.example.demo.Dao.Route.RegionDao;
import com.example.demo.Dao.Route.RouteDao;
import com.example.demo.Dao.Route.StopDao;
import com.example.demo.Entity.Route.Region;
import com.example.demo.Entity.Route.routes;
import com.example.demo.Entity.Route.stops;
import com.example.demo.Service.Route.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class RouteServicelmpl implements RouteService {
    @Autowired
    private RegionDao regionDao;
    @Autowired
    private RouteDao routedao;
    @Autowired
    private StopDao stopdao;

    @Override
    public int Add_newroute(routes route){
        int rid=route.getRoute_id();
        String start=route.getStart();
        String end=route.getEnd();
        Region R_s=regionDao.findByCity(start);
        Region R_e=regionDao.findByCity(end);
        if(R_s==null){
            return 2;
        }
        else if(R_e==null){
            return 3;
        }
        else{
            routedao.Addroute(route);
            for(int i=1;i<=2;i++){
                stops stop1;
                if(i==1){
                    stop1=new stops(rid,1,start);
                    stopdao.addstop(stop1);
                }
                else{
                    stop1=new stops(rid,2,end);
                    stopdao.addstop(stop1);
                }
            }
            return 1;
        }
    }
    @Override
    public boolean Del_route(int rid){
        routes R1=routedao.FindrouteByRid(rid);
        if(R1==null){
            return false;
        }
        else{
            routedao.deleteroute(rid);
            return true;
        }
    }
    @Override
    public boolean Change_route_add(int rid,String stopname,int stopnumber){   //在某位置增加
        Region R1=regionDao.findByCity(stopname);
        if(R1==null){
            return false;
        }
        else{
            stops stop1=new stops(rid,stopnumber,stopname);
            Map<String, Object> map = new HashMap<>();
            map.put("rid",rid);
            map.put("number",stopnumber);
            stopdao.addrefresh(map);
            stopdao.addstop(stop1);
            return true;
        }
    }
    public void Change_route_delete(int rid,int stopnumber){           //在某位置删除
        Map<String, Object> map = new HashMap<>();
        map.put("rid",rid);
        map.put("number",stopnumber);
        stopdao.delete(map);
        stopdao.delrefresh(map);
    }
}
