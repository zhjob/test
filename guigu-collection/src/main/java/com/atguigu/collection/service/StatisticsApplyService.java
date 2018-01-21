package com.atguigu.collection.service;

import java.util.List;

import com.atguigu.collection.dto.StatisticsApplyDto;
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
public interface StatisticsApplyService extends BaseService<StatisticsApplyDto,String> {
	
	/**
	 * 显示外访统计列表
	 * @param condition
	 * @return
	 */
	public SearchResult<StatisticsApplyDto> queryApply(ParamCondition condition);
	
	/** 导出所选协催  */
	List<StatisticsApplyDto> queryExport(List<String> ids);
	
	/** 导出所选  */
	List<StatisticsApplyDto> exportQueryExcel(ParamCondition condition);
	
}
