package com.xude.mapper;

import com.xude.entry.Area;

import java.util.List;

public interface AreaMapper {
    List<Area> getFirstAreas();

    List<Area> getCityAreasById(int prov_id);

    List<Area> getCountyAreaById(int city_id);
}
