package com.atguigu.collection.service;

import java.util.List;

import com.atguigu.collection.model.NoticeModel;
import com.atguigu.commons.service.BaseService;
public interface NoticeService  extends BaseService<NoticeModel,String>{
	public List<NoticeModel> queryTop();
}


