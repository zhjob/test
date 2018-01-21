package com.atguigu.collection.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.collection.dto.HelpMeDto;
import com.atguigu.collection.dto.StatisticsEntrustDto;
import com.atguigu.collection.mapper.StatisticsEntrustMapper;
import com.atguigu.collection.mapper.StatisticsMapper;
import com.atguigu.collection.service.StatisticsEntrustService;
import com.atguigu.commons.service.AbstractService;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;


@Service
public class StatisticsEntrustServicempl extends AbstractService<StatisticsEntrustDto,String> implements StatisticsEntrustService {

	
	
	@Autowired
	private StatisticsEntrustMapper statisticsMapper;

	
	/**
	 * 显示委托方基础还款统计列表
	 * @param condition
	 * @return
	 */
	@Override
	public SearchResult<StatisticsEntrustDto> queryEntrustPaid(ParamCondition condition) {
		List<StatisticsEntrustDto> list =statisticsMapper.queryEntrustPaid(condition);
		SearchResult<StatisticsEntrustDto> result = new SearchResult<>();
		result.setTotal(condition.getTotal());
		result.setRows(list);
		return result;
	}
	/**
	 * 显示委托方佣金统计列表
	 * @param condition
	 * @return
	 */
	@Override
	public SearchResult<StatisticsEntrustDto> queryEntrust(ParamCondition condition) {
		List<StatisticsEntrustDto> list =statisticsMapper.queryEntrust(condition);
		SearchResult<StatisticsEntrustDto> result = new SearchResult<>();
		result.setTotal(condition.getTotal());
		result.setRows(list);
		return result;
	}
	/**
	 * 显示委托方风控投入统计列表
	 * @param condition
	 * @return
	 */
	@Override
	public SearchResult<StatisticsEntrustDto> queryEntrustOrganization(ParamCondition condition) {
		List<StatisticsEntrustDto> list =statisticsMapper.queryEntrustOrganization(condition);
		SearchResult<StatisticsEntrustDto> result = new SearchResult<>();
		result.setTotal(condition.getTotal());
		result.setRows(list);
		return result;
	}
	/**
	 * 显示委托方案件状态统计列表
	 * @param condition
	 * @return
	 */
	@Override
	public SearchResult<StatisticsEntrustDto> queryEntrustCaseState(ParamCondition condition) {
		List<StatisticsEntrustDto> list =statisticsMapper.queryEntrustCaseState(condition);
		SearchResult<StatisticsEntrustDto> result = new SearchResult<>();
		result.setTotal(condition.getTotal());
		result.setRows(list);
		return result;
	}
	
	@Override
	public List<StatisticsEntrustDto> exportQueryExcel(ParamCondition condition) {
		List<StatisticsEntrustDto> list =statisticsMapper.queryEntrustPaid(condition);
		return list;
	}
	
	@Override
	public List<StatisticsEntrustDto> excelAll(ParamCondition condition) {
	
		return statisticsMapper.queryEntrustPaid(condition);
	}
	
	
	/** 导出所选委托方 */
	@Override
	public List<StatisticsEntrustDto> queryExport(List<String> ids) {
		List<StatisticsEntrustDto> list = statisticsMapper.queryExport(ids);
		return list;
	}

}
