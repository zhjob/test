package com.atguigu.collection.service.impl;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.collection.mapper.SocialSecurityMapper;
import com.atguigu.collection.model.SocialSecurityModel;
import com.atguigu.collection.service.SocialSecurityService;
import com.atguigu.commons.service.AbstractService;
/**
 * 社保
 * ServiceImpl
 * @author wcy
 * @date 2016年7月21日19:29:26
 */
@Service("socialSecurityService")
public class SocialSecurityServiceImpl extends AbstractService<SocialSecurityModel,String> implements SocialSecurityService {

	@Autowired
	private SocialSecurityMapper socialSecurityMapper;
	@Override
	public List<SocialSecurityModel> findByCaseApplyId(String caseApplyId) {
		return socialSecurityMapper.findByCaseApplyId(caseApplyId);
	}

	

	
}
