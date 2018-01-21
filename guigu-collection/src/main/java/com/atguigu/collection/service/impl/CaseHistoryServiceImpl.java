package com.atguigu.collection.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.collection.mapper.CaseHistoryModelMapper;
import com.atguigu.collection.model.CaseHistoryModel;
import com.atguigu.collection.service.CaseHistoryService;
import com.atguigu.commons.service.AbstractService;

@Service
public class CaseHistoryServiceImpl extends AbstractService<CaseHistoryModel, String> implements CaseHistoryService {

	@Autowired
	private CaseHistoryModelMapper caseHistoryModelMapper;
	@Override
	public int saveCaseHistory(CaseHistoryModel model) {
		// TODO Auto-generated method stub
		return caseHistoryModelMapper.save(model);
	}

}
