package com.atguigu.collection.mapper;

import java.util.List;

import com.atguigu.collection.model.NoticeModel;
import com.atguigu.commons.mapper.BaseMapper;
import com.atguigu.commons.vo.ParamCondition;

public interface NoticeModelMapper extends BaseMapper<NoticeModel, String>{
	List<NoticeModel> queryTop();
}