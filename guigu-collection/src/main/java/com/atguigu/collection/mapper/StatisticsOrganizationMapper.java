package com.atguigu.collection.mapper;

import java.util.List;

import com.atguigu.collection.dto.StatisticsBatchDto;
import com.atguigu.collection.dto.StatisticsEntrustDto;
import com.atguigu.collection.dto.StatisticsOrganizationDto;
import com.atguigu.commons.mapper.BaseMapper;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.sys.model.OrganizationModel;

/**
 * 统计mapper
 * 
 * @author zhangyj
 *
 */
public interface StatisticsOrganizationMapper extends BaseMapper<StatisticsOrganizationDto, String> {
	
	/**
	 * 风控方统计
	 * @param condition
	 * @return
	 */
	List<StatisticsOrganizationDto> queryCollection(ParamCondition condition);
	
	/** 导出所选分公司*/
	List<StatisticsOrganizationDto> queryExport(List<String> list);
	/**
	 * 查询所有顶级节点
	 * @param condition 检索条件
	 * @return 
	 *//*
	List<OrganizationModel> findTops(ParamCondition condition);
	*//**
	 * 通过父节点查询子节点
	 * @param parentId 父节点
	 * @return 
	 *//*
	List<OrganizationModel> findByParentId(String parentId);*/

	List<StatisticsOrganizationDto> queryOrganizationCaseState(ParamCondition condition);

	List<StatisticsOrganizationDto> queryOrganizationOrganization(ParamCondition condition);

	List<StatisticsOrganizationDto> queryOrganizationPaid(ParamCondition condition);
	
}