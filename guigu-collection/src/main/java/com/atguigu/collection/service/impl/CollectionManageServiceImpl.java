package com.atguigu.collection.service.impl;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.collection.dto.ControllerMessageDto;
import com.atguigu.collection.mapper.CollectionManageMapper;
import com.atguigu.collection.service.CollectionManageService;
import com.atguigu.commons.service.AbstractService;
import com.atguigu.commons.util.SQLUtil;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;
import com.atguigu.sys.model.EmployeeInfoModel;
import com.atguigu.sys.security.util.SecurityUtil;

/**
 * 催记Service实现类
 * 
 * @author wcy
 * @date 2016年6月13日13:38:15
 */
@Service("collectionManageService")
public class CollectionManageServiceImpl extends AbstractService<ControllerMessageDto,String> implements CollectionManageService {
	
	@Autowired
	private CollectionManageMapper collectionManageMapper;
	
	@Override
	public List<ControllerMessageDto> queryForId(List<String> caseIds) {
		//处理batchIds ，batchIds是数组    .xml里需要他做查询条件
		Map<String, Object> params = new HashMap<>();
		params.put("caseIds", caseIds);
		return collectionManageMapper.queryForId(params);
	}

	@Override
	public SearchResult<ControllerMessageDto> queryForPage(ParamCondition condition) {
		common(condition);
		return super.queryForPage(condition);
	}
	@Override
	public List<ControllerMessageDto> query(ParamCondition condition){
		common(condition);
		return super.query(condition);
	}

	private void common(ParamCondition condition) {
		EmployeeInfoModel currentUser = SecurityUtil.getCurrentUser();
		String attachOrgId = currentUser.getAttachOrgId();
		String queryOrgs=currentUser.getOrgId()+",";
		if(StringUtils.isNotBlank(attachOrgId)){
			queryOrgs=queryOrgs+attachOrgId;
		}
		
		String attachEntrustId = currentUser.getAttachEntrustId();
		
		condition.put("queryOrgs", SQLUtil.warpSql(queryOrgs));
		condition.put("loginName", currentUser.getLoginName());
		if(StringUtils.isNotBlank(attachEntrustId)){
			condition.put("attachEntrustId", SQLUtil.warpSql(attachEntrustId));
		}
	}
	
	

}
