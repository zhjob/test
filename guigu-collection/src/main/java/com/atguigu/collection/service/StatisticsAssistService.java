package com.atguigu.collection.service;

import java.util.List;

import com.atguigu.collection.dto.StatisticsApplyDto;
import com.atguigu.collection.dto.StatisticsAssistDto;
import com.atguigu.collection.dto.StatisticsEntrustDto;
import com.atguigu.commons.service.BaseService;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;

/**
 * 统计Service
 * 
 * @author zhangyj
 *
 */
public interface StatisticsAssistService extends BaseService<StatisticsAssistDto,String> {
	
	/**
	 * 显示统计列表
	 * @param condition
	 * @return
	 */
	public SearchResult<StatisticsAssistDto> queryAssist(ParamCondition condition);
	
	List<StatisticsAssistDto> queryExport(List<String> ids);
	
	List<StatisticsAssistDto> exportQueryExcel(ParamCondition condition);
}
