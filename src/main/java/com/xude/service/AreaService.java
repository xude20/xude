package com.xude.service;

import com.xude.entry.Area;

import java.util.List;

public interface AreaService {
    List<Area> getFirstAreas();

    List<Area> getCityAreasById(int prov_id);

    List<Area> getCountyAreasById(int city_id);
}
