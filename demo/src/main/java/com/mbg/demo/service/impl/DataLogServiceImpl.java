package com.mbg.demo.service.impl;

import javax.annotation.Resource;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import com.mbg.demo.model.DataLog;
import com.mbg.demo.mapper.DataLogMapper;
import com.mbg.demo.model.DataLogExample;import com.mbg.demo.service.DataLogService;

import com.github.liyiorg.mbg.support.service.MbgServiceSupport;

@Service
public class DataLogServiceImpl extends MbgServiceSupport<DataLogMapper, Long, DataLog, DataLog, DataLogExample> implements DataLogService{

	@Resource
	private DataLogMapper dataLogMapper;

	@PostConstruct
	private void initService(){
		super.mapper = dataLogMapper;
	}


}