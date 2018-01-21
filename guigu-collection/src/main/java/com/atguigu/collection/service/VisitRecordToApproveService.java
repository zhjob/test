package com.atguigu.collection.service;

import com.atguigu.collection.dto.VisitDto;
import com.atguigu.collection.model.VisitRecordModel;
import com.atguigu.commons.service.BaseService;


public interface VisitRecordToApproveService extends BaseService<VisitDto,String>{
	int approveYes(VisitRecordModel model);
	int approveNo(VisitRecordModel model);
	
	
}
