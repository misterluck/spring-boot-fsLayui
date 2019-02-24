package org.demo.layui.service.impl;

import org.demo.layui.entity.City;
import org.demo.layui.entity.CityExample;
import org.demo.layui.mapper.CityMapper;
import org.demo.layui.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhaol on 2019/1/15.
 */
@Service
public class CityServiceImpl extends BaseBusiness<City, CityExample> implements CityService {
    //@Autowired
    //private CityMapper cityMapper;

    @Autowired
    public void setBaseMapper(CityMapper cityMapper) {
        super.setBaseMapper(cityMapper);
    }
}
