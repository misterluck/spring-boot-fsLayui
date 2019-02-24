package org.demo.layui.controller;

import org.demo.layui.entity.*;
import org.demo.layui.entity.CityExample.Criteria;
import org.demo.layui.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zhaol on 2018/11/19.
 */
@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/info")
    @ResponseBody
    public String info(String currentPage, String pageSize) {
        CityExample cityExample = new CityExample();
        Criteria criteria = cityExample.createCriteria();
        Page page = cityService.listPageByExample("1", "10", cityExample);
        List<City> list = (List<City>) page.getData();
        for (City city: list) {
            System.out.println(city.toString());
        }
        System.out.println(currentPage+"\t"+pageSize);
        return "{'code':'999','info':'success'}";
    }

}
