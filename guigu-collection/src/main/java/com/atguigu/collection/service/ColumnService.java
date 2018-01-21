package com.atguigu.collection.service;

import java.util.List;

import com.atguigu.commons.easyui.Column;
import com.atguigu.commons.service.BaseService;
import com.atguigu.sys.model.ColumnModel;

/**
 * 动态列service
 * 
 * @author lisuo
 *
 */
public interface ColumnService extends BaseService<ColumnModel, String> {
	/**
	 * 通过用户ID查询案件动态列
	 * @param userId 用户ID
	 * @return 
	 */
	List<Column> findCaseColumnsByUserId(String userId);
	
}
