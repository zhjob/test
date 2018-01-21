package com.atguigu.collection.service;

import java.util.List;

import com.atguigu.collection.dto.StatisticsBatchDto;
import com.atguigu.collection.dto.StatisticsEntrustDto;
import com.atguigu.collection.dto.StatisticsVisitDto;
import com.atguigu.commons.service.BaseService;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;

/**
 * 统计Service
 * 
 * @author zhangyj
 *
 */
public interface StatisticsVisitService extends BaseService<StatisticsVisitDto,String> {
	
	/**
	 * 显示外访统计列表
	 * @param condition
	 * @return
	 */
	public SearchResult<StatisticsVisitDto> queryVisit(ParamCondition condition);
	
	/** 导出所选外放  */
	List<StatisticsVisitDto> queryExport(List<String> ids);
	/** 导出所查外放  */
	List<StatisticsVisitDto> exportQueryExcel(ParamCondition condition);
}
