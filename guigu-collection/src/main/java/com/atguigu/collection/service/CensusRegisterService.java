package com.atguigu.collection.service;



import java.util.List;

import com.atguigu.collection.model.CensusRegisterModel;
import com.atguigu.commons.service.BaseService;


/**
 * 户籍
 * service
 * @author wcy
 * @date 2016年7月19日10:58:33
 */
public interface CensusRegisterService  extends BaseService<CensusRegisterModel, String> {

	List<CensusRegisterModel> findByCaseApplyId(String caseApplyId);

}


