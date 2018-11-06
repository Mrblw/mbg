package com.mbg.demo;

import com.alibaba.fastjson.JSON;
import com.mbg.demo.model.DataLog;
import com.mbg.demo.model.DataLogExample;
import com.mbg.demo.service.DataLogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Resource
    DataLogService dataLogService;

    @Test
    public void contextLoads() {
        List<DataLog> dataLogs = dataLogService.selectByExample(new DataLogExample());
        System.out.println(JSON.toJSONString(dataLogs,true));
    }

}
