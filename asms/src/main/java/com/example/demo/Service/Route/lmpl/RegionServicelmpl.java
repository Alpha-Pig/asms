package com.example.demo.Service.Route.lmpl;

import com.example.demo.Dao.Route.RegionDao;
import com.example.demo.Entity.Route.Region;
import com.example.demo.Service.Route.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegionServicelmpl implements RegionService {
    @Autowired
    private RegionDao regionDao;

    @Override
    public Region selectregionbyname(String name){
       return  regionDao.findByCity(name);
    }


    @Override
    public void AddnewRegion(Region reg) {
        regionDao.AddnewRegion(reg);
    }
}
