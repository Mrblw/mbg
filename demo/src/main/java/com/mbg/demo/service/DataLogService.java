package com.mbg.demo.service;

import com.mbg.demo.model.DataLogExample;
import com.mbg.demo.model.DataLog;
import com.github.liyiorg.mbg.support.service.MbgReadService;
import com.github.liyiorg.mbg.support.service.MbgWriteService;
import com.github.liyiorg.mbg.support.service.MbgUpsertService;

public interface DataLogService extends MbgReadService<Long, DataLog, DataLog, DataLogExample>,MbgWriteService<Long, DataLog, DataLog, DataLogExample>,MbgUpsertService<Long, DataLog, DataLog, DataLogExample>{

}