package com.atguigu.collection.mapper;

import java.util.List;

import com.atguigu.collection.dto.StatisticsAssistDto;
import com.atguigu.collection.dto.StatisticsEntrustDto;
import com.atguigu.commons.mapper.BaseMapper;
import com.atguigu.commons.vo.ParamCondition;

/**
 * 统计mapper
 * 
 * @author zhangyj
 *
 */
public interface StatisticsAssistMapper extends BaseMapper<StatisticsAssistDto, String> {
	
	/**
	 * 统计
	 * @param condition
	 * @return
	 */
	List<StatisticsAssistDto> queryAssist(ParamCondition condition);
	
	List<StatisticsAssistDto> queryExport(List<String> list);
	
	
}