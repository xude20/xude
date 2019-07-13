package com.xude.service.serviceimpl;

import com.xude.entry.Area;
import com.xude.mapper.AreaMapper;
import com.xude.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    AreaMapper areaMapper;

    @Override
    public List<Area> getFirstAreas() {
        List<Area> areaList = areaMapper.getFirstAreas();
        return areaList;
    }

    @Override
    public List<Area> getCityAreasById(int prov_id) {
        List<Area> cityAreaList = areaMapper.getCityAreasById(prov_id);
        return cityAreaList;
    }

    @Override
    public List<Area> getCountyAreasById(int city_id) {
        List<Area> countyAreaList = areaMapper.getCountyAreaById(city_id);
        return countyAreaList;
    }
}
