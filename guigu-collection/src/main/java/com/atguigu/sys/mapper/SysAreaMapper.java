package com.atguigu.sys.mapper;





import java.util.List;

import com.atguigu.commons.mapper.BaseMapper;
import com.atguigu.sys.dto.AreaDto;
import com.atguigu.sys.model.AreaModel;
/**
 * 外访区域  城市  mapper
 * @author wcy
 * @date 2016年6月23日11:15:32
 *
 */
public interface SysAreaMapper extends BaseMapper<AreaDto,String> {
	
	 /** 新增判断是否重复  */
	 List<AreaModel> sizeNum(AreaModel model);
	 
	int updateForStatus(AreaModel model);
	/** 新增省份  */
	 int saveArea(AreaModel model);
	 
	 int updateArea(AreaModel model);
	 

	
}