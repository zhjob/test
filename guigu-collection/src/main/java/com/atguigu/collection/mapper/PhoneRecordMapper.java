package com.atguigu.collection.mapper;

import java.util.List;

import com.atguigu.collection.model.PhoneRecordModel;
import com.atguigu.collection.vo.PhoneRecordVo;
import com.atguigu.commons.mapper.BaseMapper;
import com.atguigu.commons.vo.ParamCondition;

public interface PhoneRecordMapper extends BaseMapper<PhoneRecordModel, String> {
	int deleteByPrimaryKey(String id);
	int insertSelective(PhoneRecordModel record);

	PhoneRecordModel selectByPrimaryKey(String id);

	List<PhoneRecordModel> selectByCaseId(String caseId);
	
	List<PhoneRecordModel> queryByCaseId(String caseId);

	int updateStatusByPrimaryKey(PhoneRecordModel record);
	
	List<PhoneRecordVo> queryPhoneRecordByCondition(ParamCondition condition);
}