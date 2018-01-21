package com.atguigu.sys.mapper;

import java.util.List;

import com.atguigu.commons.mapper.BaseMapper;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.sys.model.OrganizationModel;

/**
 * 织机构 Mapper
 * @author lisuo
 *
 */
public interface OrganizationMapper extends BaseMapper<OrganizationModel,String>{
	
	/**
	 * 查询所有顶级节点
	 * @param condition 检索条件
	 * @return 
	 */
	List<OrganizationModel> findTops(ParamCondition condition);
	/**
	 * 通过父节点查询子节点
	 * @param parentId 父节点
	 * @return 
	 */
	List<OrganizationModel> findByParentId(String parentId);
	List<OrganizationModel> findDescendantsByPath(String path);
	/**
	 * 获取最大排序号
	 * @return
	 */
	Integer findMaxSort();

}
