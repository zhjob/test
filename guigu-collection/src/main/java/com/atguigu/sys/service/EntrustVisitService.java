package com.atguigu.sys.service;

import java.util.List;

import com.atguigu.commons.service.BaseService;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;
import com.atguigu.sys.dto.EntrustVisitDto;
import com.atguigu.sys.model.EntrustVisit;

/**
 *  委托方Service
 * @author zhangyj
 */
public interface EntrustVisitService extends BaseService<EntrustVisitDto,String>{
	
	List<EntrustVisit> findByProductId(String productId);
	
}
