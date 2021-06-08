package com.example.demo.Controller.Route;


import com.example.demo.Service.Route.RegionService;
import com.example.demo.Entity.Route.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegionController {
    @Autowired
    private RegionService region_service;
    @PostMapping("/addregion")
    public String addnewRegion(@RequestBody  String rmp){
        String name=rmp;
        Region r1=new Region(rmp);
        Region r2=region_service.selectregionbyname(name);
        if(r2==null){
            region_service.AddnewRegion(r1);
            return "region add success";
        }
        else{
            return "region already exists";
        }
    }

}
