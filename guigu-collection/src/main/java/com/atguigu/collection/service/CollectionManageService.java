package com.atguigu.collection.service;


import java.util.List;

import com.atguigu.collection.dto.ApproveDto;
import com.atguigu.collection.dto.ControllerMessageDto;
import com.atguigu.commons.service.BaseService;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;

/**
 *  催记Service  
 * @author wcy
 * @date 2016年6月13日13:37:22
 */
public interface CollectionManageService extends BaseService<ControllerMessageDto,String>{
	
	List<ControllerMessageDto> queryForId(List<String> caseIds);
	
}
