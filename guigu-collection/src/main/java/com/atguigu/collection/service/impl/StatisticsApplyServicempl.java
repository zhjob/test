package com.atguigu.collection.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.collection.dto.StatisticsApplyDto;
import com.atguigu.collection.dto.StatisticsEntrustDto;
import com.atguigu.collection.mapper.StatisticsApplyMapper;
import com.atguigu.collection.service.StatisticsApplyService;
import com.atguigu.commons.service.AbstractService;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;


@Service
public class StatisticsApplyServicempl extends AbstractService<StatisticsApplyDto,String> implements StatisticsApplyService {

	
	
	@Autowired
	private StatisticsApplyMapper statisticsMapper;

	@Override
	public SearchResult<StatisticsApplyDto> queryApply(ParamCondition condition) {
		List<StatisticsApplyDto> list =statisticsMapper.queryApply(condition);
		SearchResult<StatisticsApplyDto> result = new SearchResult<>();
		result.setTotal(condition.getTotal());
		result.setRows(list);
		return result;
	}
	

	@Override
	public List<StatisticsApplyDto> queryExport(List<String> ids) {
		List<StatisticsApplyDto> list = statisticsMapper.queryExport(ids);
		return list;
	}
	
	@Override
	public List<StatisticsApplyDto> exportQueryExcel(ParamCondition condition) {
		List<StatisticsApplyDto> list =statisticsMapper.queryApply(condition);
		return list;
	}

}
