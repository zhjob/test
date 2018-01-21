package com.atguigu.collection.service;

import java.util.List;

import com.atguigu.collection.dto.StatisticsEmployeeDto;
import com.atguigu.collection.dto.StatisticsEmployeeDto;
import com.atguigu.collection.dto.StatisticsOrganizationDto;
import com.atguigu.commons.service.BaseService;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;

/**
 * 统计Service
 * 
 * @author zhangyj
 *
 */
public interface StatisticsEmployeeService extends BaseService<StatisticsEmployeeDto,String> {
	
	/**
	 * 统计列表
	 * @param condition
	 * @return
	 */
	public SearchResult<StatisticsEmployeeDto> queryEmployee(ParamCondition condition);
	
	/** 导出所选  */
	List<StatisticsEmployeeDto> queryExport(List<String> ids);
	/** 导出所查  */
	List<StatisticsEmployeeDto> exportQueryExcel(ParamCondition condition);

	public SearchResult<StatisticsEmployeeDto> queryEmployeeCaseState(ParamCondition condition);

	public SearchResult<StatisticsEmployeeDto> queryEmployeeOrganization(ParamCondition condition);

	public SearchResult<StatisticsEmployeeDto> queryEmployeePaid(ParamCondition condition);
	
}
