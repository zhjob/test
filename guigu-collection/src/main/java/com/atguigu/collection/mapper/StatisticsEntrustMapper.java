package com.atguigu.collection.mapper;

import java.util.List;

import com.atguigu.collection.dto.HelpMeDto;
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
public interface StatisticsEntrustMapper extends BaseMapper<StatisticsEntrustDto, String> {
	
	/**
	 * 委托方统计
	 * @param condition
	 * @return
	 */
	List<StatisticsEntrustDto> queryEntrust(ParamCondition condition);
	
	/** 导出所选委托方*/
	List<StatisticsEntrustDto> queryExport(List<String> list);
	
	/**
	 * 委托方基础统计
	 * @param condition
	 * @return
	 */
	List<StatisticsEntrustDto> queryEntrustPaid(ParamCondition condition);

	/**
	 * 委托方风控投入统计
	 * @param condition
	 * @return
	 */
	List<StatisticsEntrustDto> queryEntrustOrganization(ParamCondition condition);

	/**
	 * 委托方案件状态统计
	 * @param condition
	 * @return
	 */
	List<StatisticsEntrustDto> queryEntrustCaseState(ParamCondition condition);
	
}