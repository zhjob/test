package com.atguigu.collection.service;


import java.util.List;

import com.atguigu.collection.model.SocialSecurityModel;
import com.atguigu.commons.service.BaseService;


/**
 * 社保
 * service
 * @author wcy
 * @date 2016年7月21日19:28:40
 */
public interface SocialSecurityService  extends BaseService<SocialSecurityModel, String> {

	List<SocialSecurityModel> findByCaseApplyId(String caseApplyId);
	
	
}


