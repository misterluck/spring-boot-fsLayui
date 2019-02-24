package org.demo.layui.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaol on 2019/1/24.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CityControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void infoTest() throws Exception {
        /*MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/info?currentPage=1&pageSize=10")).andReturn();
        System.out.println(result.getResponse().getContentAsString());*/

        mockMvc.perform(MockMvcRequestBuilders.post("/info")
                .param("currentPage", "1")
                .param("pageSize", "10")).andReturn();
    }

}
