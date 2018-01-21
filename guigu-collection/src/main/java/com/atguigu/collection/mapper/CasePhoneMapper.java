package com.atguigu.collection.mapper;

import com.atguigu.collection.model.CasePhoneModel;
import com.atguigu.commons.mapper.BaseMapper;

public interface CasePhoneMapper  extends BaseMapper<CasePhoneModel, String> {

	int deleteByPrimaryKey(String id);


	int insertSelective(CasePhoneModel record);

	CasePhoneModel selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(CasePhoneModel record);

	int updateByPrimaryKey(CasePhoneModel record);
}