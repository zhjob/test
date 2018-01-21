package com.atguigu.collection.service;

import java.util.List;

import com.atguigu.collection.dto.AddressDto;
import com.atguigu.collection.exception.AddressException;
import com.atguigu.collection.model.AddressModel;
import com.atguigu.commons.service.BaseService;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;
public interface AddressService  extends BaseService<AddressModel,String>{
	List<AddressModel> queryByCaseId(String caseId);
	AddressModel findById(String id);
	List<AddressModel> findFinishedVisitRecord(String caseId);
	AddressDto findFullAddress(String areaId1,String areaId2,String areaId3) throws AddressException;
	void updateById(AddressModel address);
	SearchResult<AddressModel> queryDetail(ParamCondition condition);
	List<AddressModel> query(ParamCondition condition);
	List<AddressModel> AddressAll(String caseId);
	
	
}


