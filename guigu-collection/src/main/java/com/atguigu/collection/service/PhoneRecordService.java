package com.atguigu.collection.service;

import java.util.List;

import com.atguigu.collection.model.PhoneRecordModel;
import com.atguigu.collection.vo.PhoneRecordVo;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;

public interface PhoneRecordService {
	List<PhoneRecordModel> query(String caseId);
	List<PhoneRecordModel> queryByCaseId(String caseId);
	SearchResult<PhoneRecordVo> queryForPage(ParamCondition condition);
}
