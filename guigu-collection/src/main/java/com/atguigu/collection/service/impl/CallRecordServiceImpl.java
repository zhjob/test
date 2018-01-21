package com.atguigu.collection.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.collection.mapper.CallRecordMapper;
import com.atguigu.collection.model.CallRecord;
import com.atguigu.collection.service.CallRecordService;
import com.atguigu.commons.service.AbstractService;

/**
 * 电催统计 Service实现类
 * 
 * @author zhangyj
 * @date 2016年12月29日
 */
@Service("callRecordService")
public class CallRecordServiceImpl extends AbstractService<CallRecord, String> implements CallRecordService {

//	@Autowired
//	private CallRecordMapper callRecordMapper;

}
