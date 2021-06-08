package com.example.demo.Controller.Route;

import com.example.demo.Entity.Route.routes;
import com.example.demo.Service.Route.lmpl.RouteServicelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class RouteController {
    @Autowired
    private RouteServicelmpl routeServicelmpl;
    @PostMapping("/addroute")
    public String addnewRoute(@RequestBody routes route){
        int rid=route.getRoute_id();
        String start=route.getStart();
        String end=route.getEnd();
        int type=routeServicelmpl.Add_newroute(route);
        if(type==2){
            return "起始车站不存在";
        }
        else if(type==3){
            return "终点车站不存在";
        }
        else{
            return "添加路线成功！";
        }
    }

    @PostMapping("/delroute")
    public String deleteRoute(@RequestBody int rid){
        boolean type=routeServicelmpl.Del_route(rid);
        if(type==true){
            return "删除成功";
        }
        else{
            return "路线不存在";
        }
    }

    @PostMapping("/changeRouteadd")
    public String changeRouteadd(@RequestBody Map<String, String> remap){
        String rid=remap.get("rid");
        String stopname=remap.get("stopname");
        String stopnumber=remap.get("number");
        int a=Integer.parseInt(rid);
        int b=Integer.parseInt(stopnumber);
        boolean type=routeServicelmpl.Change_route_add(a,stopname,b);
        if(type==false){
            return "改变失败";
        }
        else{
            return "更改成功";
        }
    }

    @PostMapping("/changeRoutedelBynum")
    public String changeRoutedelBynum(@RequestBody Map<String, String> remap){
        String rid=remap.get("rid");
        String stopnumber=remap.get("number");
        int a=Integer.parseInt(rid);
        int b=Integer.parseInt(stopnumber);
        routeServicelmpl.Change_route_delete(a,b);
        return "删除成功";
    }
}
