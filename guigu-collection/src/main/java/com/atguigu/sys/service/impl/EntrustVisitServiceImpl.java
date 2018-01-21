package com.atguigu.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.commons.service.AbstractService;
import com.atguigu.sys.dto.EntrustVisitDto;
import com.atguigu.sys.mapper.EntrustVisitMapper;
import com.atguigu.sys.model.EntrustLinkman;
import com.atguigu.sys.model.EntrustVisit;
import com.atguigu.sys.service.EntrustVisitService;

/**
 * 委托方 Service实现类
 * 
 * @author zhangyj
 */
@Service("entrustVisitService")
public class EntrustVisitServiceImpl extends AbstractService<EntrustVisitDto,String> implements EntrustVisitService {
	@Autowired
	private EntrustVisitMapper entrustVisitmapper;
	
	@Override
	public List<EntrustVisit> findByProductId(String productId){
		
		return entrustVisitmapper.findByProductId(productId);
	}

}
