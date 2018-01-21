package com.atguigu.sys.service;


import com.atguigu.commons.service.BaseService;
import com.atguigu.sys.dto.AreaDto;
import com.atguigu.sys.model.AreaModel;
import com.atguigu.sys.model.CityModel;

/**
 *  外访区域 城市Service
 * @author wcy
 * @date 2016年6月23日11:07:22
 */
public interface SysAreaService extends BaseService<AreaDto,String>{
	
	/** 省份  禁用/启用*/
	 int updateForStatus(AreaModel model);
	 /** 新增省份  */
	 int saveArea(AreaModel model);
	 /** 编辑  */
	 int updateArea(AreaModel model);
}
