package com.atguigu.collection.mapper;

import java.util.List;

import com.atguigu.collection.dto.StatisticsBatchDto;
import com.atguigu.collection.dto.StatisticsEntrustDto;
import com.atguigu.collection.dto.StatisticsOrganizationDto;
import com.atguigu.commons.mapper.BaseMapper;
import com.atguigu.commons.vo.ParamCondition;

/**
 * 统计mapper
 * 
 * @author zhangyj
 *
 */
public interface StatisticsMapper extends BaseMapper<StatisticsBatchDto, String> {
	
	/**
	 * 批次统计
	 * @param condition
	 * @return
	 */
	List<StatisticsBatchDto> queryBatch(ParamCondition condition);
	
	/** 导出所选批次*/
	List<StatisticsBatchDto> queryExport(List<String> list);
	
	/**
	 * 委托方统计
	 * @param condition
	 * @return
	 */
	List<StatisticsEntrustDto> queryEntrust(ParamCondition condition);
	/**
	 * 风控方统计
	 * @param condition
	 * @return
	 */
	List<StatisticsOrganizationDto> queryCollection(ParamCondition condition);

	List<StatisticsBatchDto> queryBatchOrganization(ParamCondition condition);

	List<StatisticsBatchDto> queryBatchPaid(ParamCondition condition);

	List<StatisticsBatchDto> queryBatchCaseState(ParamCondition condition);
	
	
}