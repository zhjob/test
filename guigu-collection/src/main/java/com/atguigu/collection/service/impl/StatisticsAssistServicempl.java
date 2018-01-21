package com.atguigu.collection.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.collection.dto.StatisticsApplyDto;
import com.atguigu.collection.dto.StatisticsAssistDto;
import com.atguigu.collection.dto.StatisticsEntrustDto;
import com.atguigu.collection.mapper.StatisticsAssistMapper;
import com.atguigu.collection.service.StatisticsAssistService;
import com.atguigu.commons.service.AbstractService;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;


@Service
public class StatisticsAssistServicempl extends AbstractService<StatisticsAssistDto,String> implements StatisticsAssistService {

	
	
	@Autowired
	private StatisticsAssistMapper statisticsMapper;

	@Override
	public SearchResult<StatisticsAssistDto> queryAssist(ParamCondition condition) {
		List<StatisticsAssistDto> list =statisticsMapper.queryAssist(condition);
		SearchResult<StatisticsAssistDto> result = new SearchResult<>();
		result.setTotal(condition.getTotal());
		result.setRows(list);
		return result;
	}

	@Override
	public List<StatisticsAssistDto> queryExport(List<String> ids) {
		List<StatisticsAssistDto> list = statisticsMapper.queryExport(ids);
		return list;
	}
	
	@Override
	public List<StatisticsAssistDto> exportQueryExcel(ParamCondition condition) {
		List<StatisticsAssistDto> list =statisticsMapper.queryAssist(condition);
		return list;
	}

}
