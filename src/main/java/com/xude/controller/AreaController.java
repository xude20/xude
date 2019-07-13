package com.xude.controller;

import com.xude.entry.Area;
import com.xude.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AreaController {

    @Autowired
    AreaService areaService;

    @RequestMapping("/provinceController")
    @ResponseBody
    public List<Area> getFirstAreas() {
        List<Area> areaList = areaService.getFirstAreas();
        System.out.println(areaList);
        return areaList;
    }

    @RequestMapping("/cityController")
    @ResponseBody
    public List<Area> getCityAreasById(int pro_id) {
        System.out.println("prov_id+++++++"+pro_id);
        List<Area> cityAreaList = areaService.getCityAreasById(pro_id);
        System.out.println(cityAreaList);
        return cityAreaList;
    }

    @RequestMapping("/countyController")
    @ResponseBody
    public List<Area> getCountyAreasById(int city_id) {
        System.out.println("prov_id+++++++"+city_id);
        List<Area> countyAreaList = areaService.getCountyAreasById(city_id);
        System.out.println(countyAreaList);
        return countyAreaList;
    }
}
