package com.mbg.demo.Controller;

import com.alibaba.fastjson.JSON;
import com.github.ddth.id.SnowflakeIdGenerator;
import com.github.liyiorg.mbg.bean.Page;
import com.mbg.demo.model.DataLog;
import com.mbg.demo.model.DataLogExample;
import com.mbg.demo.service.DataLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private DataLogService dataLogService;

    @RequestMapping(value = "/index")
    public String index(){
        SnowflakeIdGenerator idGenerator = SnowflakeIdGenerator.getInstance();
        long l = idGenerator.generateId48();
        long l1 = idGenerator.generateId64();
        BigInteger bigInteger = idGenerator.generateId128();
        long l2 = idGenerator.generateIdMini();
        long l3 = idGenerator.generateIdTiny();
        Page<DataLog> dataLogPage = dataLogService.selectPageByExample(new DataLogExample(), 1, 10);
        List<DataLog> data = dataLogPage.getData();
        System.out.println(JSON.toJSONString(data,true));
        return JSON.toJSONString(data);
    }
}
