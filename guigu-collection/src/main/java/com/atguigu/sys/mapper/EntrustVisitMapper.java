package com.atguigu.sys.mapper;

import java.util.List;
import java.util.Map;

import com.atguigu.commons.mapper.BaseMapper;
import com.atguigu.sys.dto.EntrustVisitDto;
import com.atguigu.sys.model.EntrustModel;
import com.atguigu.sys.model.EntrustVisit;

/**
 * 委托方mapper
 * @author zhangyj
 * @date 2016.6.1
 *
 */
public interface EntrustVisitMapper extends BaseMapper<EntrustVisitDto,String> {
	
	List<EntrustVisit> findByProductId(String productId);
}