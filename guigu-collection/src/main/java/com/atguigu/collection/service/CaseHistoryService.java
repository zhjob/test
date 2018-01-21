package com.atguigu.collection.service;

import com.atguigu.collection.model.CaseHistoryModel;
import com.atguigu.commons.service.BaseService;

public interface CaseHistoryService extends BaseService<CaseHistoryModel, String>{
	int saveCaseHistory(CaseHistoryModel model);

}
