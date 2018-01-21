package com.atguigu.collection.service;
import java.util.List;

import com.atguigu.collection.model.ExpressModel;
import com.atguigu.commons.service.BaseService;


/**
 * 快递
 * service
 * @author wcy
 * @date 2016年12月16日11:26:32
 */
public interface ExpressService  extends BaseService<ExpressModel, String> {

	List<ExpressModel> findByCaseApplyId(String caseApplyId);
	
}


