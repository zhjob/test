package com.atguigu.collection.mapper;

import java.util.List;

import com.atguigu.collection.dto.StatisticsBatchDto;
import com.atguigu.collection.dto.StatisticsEntrustDto;
import com.atguigu.collection.dto.StatisticsOrganizationDto;
import com.atguigu.collection.dto.StatisticsVisitDto;
import com.atguigu.commons.mapper.BaseMapper;
import com.atguigu.commons.vo.ParamCondition;

/**
 * 统计mapper
 * 
 * @author zhangyj
 *
 */
public interface StatisticsVisitMapper extends BaseMapper<StatisticsVisitDto, String> {
	
	/**
	 * 统计
	 * @param condition
	 * @return
	 */
	List<StatisticsVisitDto> queryVisit(ParamCondition condition);
	
	/** 导出所选委托方*/
	List<StatisticsVisitDto> queryExport(List<String> list);
	
}