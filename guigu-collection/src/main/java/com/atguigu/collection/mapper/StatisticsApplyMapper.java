package com.atguigu.collection.mapper;

import java.util.List;

import com.atguigu.collection.dto.StatisticsApplyDto;
import com.atguigu.collection.dto.StatisticsEntrustDto;
import com.atguigu.commons.mapper.BaseMapper;
import com.atguigu.commons.vo.ParamCondition;

/**
 * 统计mapper
 * 
 * @author zhangyj
 *
 */
public interface StatisticsApplyMapper extends BaseMapper<StatisticsApplyDto, String> {
	
	/**
	 * 统计
	 * @param condition
	 * @return
	 */
	List<StatisticsApplyDto> queryApply(ParamCondition condition);
	
	
	List<StatisticsApplyDto> queryExport(List<String> list);
	
}