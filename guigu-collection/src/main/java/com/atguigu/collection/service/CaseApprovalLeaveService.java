package com.atguigu.collection.service;

import java.util.List;

import com.atguigu.collection.dto.ApproveDto;
import com.atguigu.collection.model.ApproveRecordModel;
import com.atguigu.commons.service.BaseService;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;

/**
 *  审批Service  
 * @author wcy
 * @date 2016年5月24日17:39:06
 */
public interface CaseApprovalLeaveService extends BaseService<ApproveDto,String>{
	
	SearchResult<ApproveDto> queryforLeave(ParamCondition condition);
	List<ApproveDto> queryforLeaveList(ParamCondition condition);
	int approvalYes(ApproveRecordModel model);
	
	
}
