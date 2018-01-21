package com.atguigu.collection.mapper;

import java.util.List;

import com.atguigu.collection.model.TelecomModel;
import com.atguigu.commons.mapper.BaseMapper;

public interface TelecomMapper extends BaseMapper<TelecomModel, String>{

	List<TelecomModel> findByCaseApplyId(String caseApplyId);
 
}