package com.atguigu.collection.mapper;

import java.util.List;

import com.atguigu.collection.model.CensusRegisterModel;
import com.atguigu.commons.mapper.BaseMapper;

/**
 * 户籍mapper
 * @author zhangyj
 *
 */
public interface CensusRegisterMapper extends BaseMapper<CensusRegisterModel, String> {
	/**
	 * 修改状态 
	 * @param model
	 * @return
	 */
	int updateForStatus(CensusRegisterModel model);
	public List<CensusRegisterModel> findByCaseApplyId(String caseApplyId);
}