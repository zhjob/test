package com.atguigu.collection.mapper;



import java.util.List;
import java.util.Map;

import com.atguigu.collection.dto.ApproveDto;
import com.atguigu.collection.dto.ControllerMessageDto;
import com.atguigu.commons.mapper.BaseMapper;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;
/**
 * 催记mapper
 * @author wcy
 * @date 2016年6月13日13:43:17
 *
 */
public interface CollectionManageMapper extends BaseMapper<ControllerMessageDto,String> {
	
	List<ControllerMessageDto> queryForId(Map<String, Object> params);
	
	List<ControllerMessageDto> queryAll(ParamCondition condition);
	
}