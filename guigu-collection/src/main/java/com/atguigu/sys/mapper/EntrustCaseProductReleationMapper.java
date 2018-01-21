package com.atguigu.sys.mapper;

import java.util.List;
import java.util.Map;

import com.atguigu.commons.mapper.BaseMapper;
import com.atguigu.sys.model.EntrustCaseProductReleation;
import com.atguigu.sys.model.EntrustCaseSource;
import com.atguigu.sys.model.EntrustModel;

/**
 * 委托方mapper
 * @author zhangyj
 * @date 2016.6.1
 *
 */
public interface EntrustCaseProductReleationMapper extends BaseMapper<EntrustCaseProductReleation,String> {
	
	 List<EntrustCaseProductReleation> findByEntrustId(String id);
	 
	 
	 EntrustCaseProductReleation findByProductId(String productId);
	
	
}