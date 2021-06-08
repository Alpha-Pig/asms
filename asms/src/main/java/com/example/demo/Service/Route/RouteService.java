package com.example.demo.Service.Route;


import com.example.demo.Entity.Route.routes;

public interface RouteService {
    public int Add_newroute(routes route);
    public boolean Del_route(int rid);
    public boolean Change_route_add(int rid, String stopname, int stopnumber);
    public void Change_route_delete(int rid, int stopnumber);
}
