package com.atguigu.collection.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.collection.dto.StatisticsBatchDto;
import com.atguigu.collection.dto.StatisticsEntrustDto;
import com.atguigu.collection.dto.StatisticsVisitDto;
import com.atguigu.collection.mapper.StatisticsVisitMapper;
import com.atguigu.collection.service.StatisticsVisitService;
import com.atguigu.commons.service.AbstractService;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;


@Service
public class StatisticsVisitServicempl extends AbstractService<StatisticsVisitDto,String> implements StatisticsVisitService {

	
	
	@Autowired
	private StatisticsVisitMapper statisticsMapper;

	@Override
	public SearchResult<StatisticsVisitDto> queryVisit(ParamCondition condition) {
		List<StatisticsVisitDto> list =statisticsMapper.queryVisit(condition);
		SearchResult<StatisticsVisitDto> result = new SearchResult<>();
		result.setTotal(condition.getTotal());
		result.setRows(list);
		return result;
	}
	
	/** 导出所选外访*/
	@Override
	public List<StatisticsVisitDto> queryExport(List<String> ids) {
		List<StatisticsVisitDto> list = statisticsMapper.queryExport(ids);
		return list;
	}
	
	/** 导出所查外访 */
	@Override
	public List<StatisticsVisitDto> exportQueryExcel(ParamCondition condition) {
		List<StatisticsVisitDto> list =statisticsMapper.queryVisit(condition);
		return list;
	}

}
