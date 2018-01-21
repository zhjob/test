package com.atguigu.sys.mapper;

import java.util.List;

import com.atguigu.commons.mapper.BaseMapper;
import com.atguigu.sys.model.VisitTemplateModel;

/**
 * 外访模板Mapper
 * 
 * @author lisuo
 *
 */
public interface VisitTemplateMapper extends BaseMapper<VisitTemplateModel, String> {
	
	List<VisitTemplateModel> findByName(VisitTemplateModel model);
	
	/**外访禁用/启用模板*/
    int updateForStatus(List<String> list);
    
    /**外访禁用/启用模板*/
    int updateForStop(List<String> list);

	List<VisitTemplateModel> findByType(Integer type);
}
