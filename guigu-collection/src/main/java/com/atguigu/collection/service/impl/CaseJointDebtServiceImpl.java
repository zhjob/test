package com.atguigu.collection.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.collection.mapper.CaseMapper;
import com.atguigu.collection.service.CaseJointDebtService;
import com.atguigu.collection.vo.CaseJointDebtVo;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;
@Service
public class CaseJointDebtServiceImpl implements CaseJointDebtService{
	@Autowired
	private CaseMapper caseMapper;
	@Override
	public SearchResult<CaseJointDebtVo> query(ParamCondition condition) {
		List<CaseJointDebtVo> list = caseMapper.queryCaseJointDebts(condition);
		SearchResult<CaseJointDebtVo> result = new SearchResult<>();
		result.setTotal(condition.getTotal());
		result.setRows(list);
		return result;
	}
	
	
	
	
	
}
