package com.mbg.demo.mapper;

import com.github.liyiorg.mbg.support.mapper.MbgReadMapper;
import com.github.liyiorg.mbg.support.mapper.MbgUpsertMapper;
import com.github.liyiorg.mbg.support.mapper.MbgWriteMapper;
import com.mbg.demo.model.DataLog;
import com.mbg.demo.model.DataLogExample;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DataLogMapper extends MbgUpsertMapper<Long, DataLog, DataLog, DataLogExample>, MbgReadMapper<Long, DataLog, DataLog, DataLogExample>, MbgWriteMapper<Long, DataLog, DataLog, DataLogExample> {
}