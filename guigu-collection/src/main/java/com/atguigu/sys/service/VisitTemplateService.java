package com.atguigu.sys.service;

import java.util.List;

import com.atguigu.commons.service.BaseService;
import com.atguigu.sys.model.VisitTemplateModel;

/**
 * 外访模板Service
 * @author lisuo
 *
 */
public interface VisitTemplateService extends BaseService<VisitTemplateModel,String>{
	
	/** 外访禁用/启用模板*/
	public int updateForStatus(List<String> list);
	
	/** 外访禁用/启用模板*/
	public int updateForStop(List<String> list);

	public List<VisitTemplateModel> findByType(Integer type);
}
