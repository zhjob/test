package com.atguigu.collection.mapper;

import java.util.List;

import com.atguigu.collection.dto.StatisticsBatchDto;
import com.atguigu.collection.dto.StatisticsEmployeeDto;
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
public interface StatisticsEmployeeMapper extends BaseMapper<StatisticsEmployeeDto, String> {
	
	/**
	 * 风控y统计
	 * @param condition
	 * @return
	 */
	List<StatisticsEmployeeDto> queryEmployee(ParamCondition condition);
	/** 导出所选批次*/
	List<StatisticsEmployeeDto> queryExport(List<String> list);

	List<StatisticsEmployeeDto> queryEmployeeOrganization(ParamCondition condition);

	List<StatisticsEmployeeDto> queryEmployeePaid(ParamCondition condition);

	List<StatisticsEmployeeDto> queryEmployeeCaseState(ParamCondition condition);
	
	
}