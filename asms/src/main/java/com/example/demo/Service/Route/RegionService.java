package com.example.demo.Service.Route;

import com.example.demo.Entity.Route.Region;

public interface RegionService {
    public Region selectregionbyname(String name);
    public void AddnewRegion(Region reg);
}
