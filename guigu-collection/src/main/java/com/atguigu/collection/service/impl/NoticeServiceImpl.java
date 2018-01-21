package com.atguigu.collection.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.collection.mapper.NoticeModelMapper;
import com.atguigu.collection.model.NoticeModel;
import com.atguigu.collection.service.NoticeService;
import com.atguigu.commons.service.AbstractService;

@Service
public class NoticeServiceImpl extends AbstractService<NoticeModel, String> implements NoticeService {

	@Autowired
	private NoticeModelMapper noticeMapper;

	@Override
	public List<NoticeModel> queryTop() {
		return noticeMapper.queryTop();
	}
	
	
	
}
