package com.atguigu.collection.service;



import java.util.List;

import com.atguigu.collection.model.TelecomModel;
import com.atguigu.commons.service.BaseService;


/**
 * 电信
 * service
 * @author wcy
 * @date 2016年7月21日20:34:14
 */
public interface TelecomService  extends BaseService<TelecomModel, String> {

	List<TelecomModel> findbyCaseApplyId(String caseApplyId);
	
}


