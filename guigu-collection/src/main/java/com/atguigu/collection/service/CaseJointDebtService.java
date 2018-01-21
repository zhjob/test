package com.atguigu.collection.service;

import com.atguigu.collection.vo.CaseJointDebtVo;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;
public interface CaseJointDebtService {
	public SearchResult<CaseJointDebtVo> query(ParamCondition condition);
}
