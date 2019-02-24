package org.demo.layui.service;

import org.demo.layui.Application;
import org.demo.layui.entity.City;
import org.demo.layui.entity.CityExample;
import org.demo.layui.entity.CityExample.Criteria;
import org.demo.layui.entity.Page;
import org.demo.layui.service.CityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by zhaol on 2019/1/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class CityTest {

    @Autowired
    private CityService cityService;

    @Test
    public void test() {
        CityExample cityExample = new CityExample();
        Criteria criteria = cityExample.createCriteria();
        Page page = cityService.listPageByExample("1", "10", cityExample);
        List<City> list = (List<City>) page.getData();
        for (City city: list) {
            System.out.println(city.toString());
        }
    }

}
