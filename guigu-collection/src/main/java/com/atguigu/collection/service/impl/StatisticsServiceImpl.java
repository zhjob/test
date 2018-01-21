package com.atguigu.collection.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.collection.dto.StatisticsBatchDto;
import com.atguigu.collection.dto.StatisticsEntrustDto;
import com.atguigu.collection.dto.StatisticsOrganizationDto;
import com.atguigu.collection.mapper.StatisticsMapper;
import com.atguigu.collection.service.StatisticsService;
import com.atguigu.commons.service.AbstractService;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;


@Service
public class StatisticsServiceImpl extends AbstractService<StatisticsBatchDto,String> implements StatisticsService {

	
	
	@Autowired
	private StatisticsMapper statisticsMapper;

	@Override
	public SearchResult<StatisticsBatchDto> queryBatch(ParamCondition condition) {
		List<StatisticsBatchDto> list =statisticsMapper.queryBatch(condition);
		SearchResult<StatisticsBatchDto> result = new SearchResult<>();
		result.setTotal(condition.getTotal());
		result.setRows(list);
		return result;
	}
	@Override
	public SearchResult<StatisticsBatchDto> queryBatchCaseState(ParamCondition condition) {
		List<StatisticsBatchDto> list =statisticsMapper.queryBatchCaseState(condition);
		SearchResult<StatisticsBatchDto> result = new SearchResult<>();
		result.setTotal(condition.getTotal());
		result.setRows(list);
		return result;
	}
	@Override
	public SearchResult<StatisticsBatchDto> queryBatchPaid(ParamCondition condition) {
		List<StatisticsBatchDto> list =statisticsMapper.queryBatchPaid(condition);
		SearchResult<StatisticsBatchDto> result = new SearchResult<>();
		result.setTotal(condition.getTotal());
		result.setRows(list);
		return result;
	}
	@Override
	public SearchResult<StatisticsBatchDto> queryBatchOrganization(ParamCondition condition) {
		List<StatisticsBatchDto> list =statisticsMapper.queryBatchOrganization(condition);
		SearchResult<StatisticsBatchDto> result = new SearchResult<>();
		result.setTotal(condition.getTotal());
		result.setRows(list);
		return result;
	}
	
	/** 导出所选委托方 */
	@Override
	public List<StatisticsBatchDto> queryExport(List<String> ids) {
		List<StatisticsBatchDto> list = statisticsMapper.queryExport(ids);
		return list;
	}
	
	/** 导出所查委托方 */
	@Override
	public List<StatisticsBatchDto> exportQueryExcel(ParamCondition condition) {
		List<StatisticsBatchDto> list =statisticsMapper.queryBatch(condition);
		return list;
	}

	@Override
	public SearchResult<StatisticsEntrustDto> queryEntrust(ParamCondition condition) {
		List<StatisticsEntrustDto> list =statisticsMapper.queryEntrust(condition);
		SearchResult<StatisticsEntrustDto> result = new SearchResult<>();
		result.setTotal(condition.getTotal());
		result.setRows(list);
		return result;
	}

	@Override
	public SearchResult<StatisticsOrganizationDto> queryCollection(ParamCondition condition) {
		List<StatisticsOrganizationDto> list =statisticsMapper.queryCollection(condition);
		SearchResult<StatisticsOrganizationDto> result = new SearchResult<>();
		result.setTotal(condition.getTotal());
		result.setRows(list);
		return result;
	}

}
