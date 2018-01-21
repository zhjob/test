package com.atguigu.collection.service;

import java.util.List;

import com.atguigu.collection.dto.CaseDto;
import com.atguigu.collection.model.ApproveRecordModel;
import com.atguigu.collection.model.VisitRecordModel;
import com.atguigu.commons.service.BaseService;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;

/**
 *  审批Service  
 * @author wcy
 * @date 2016年5月24日17:39:06
 */
public interface CaseApprovalService extends BaseService<CaseDto,String>{
	
	SearchResult<CaseDto> queryforGo(ParamCondition condition);
	
	SearchResult<CaseDto> queryforLeave(ParamCondition condition);
	
	public int updatefoApp(ApproveRecordModel model);
	
	public int updatefoVi(VisitRecordModel model);
	
	public int saveApproveRecord(ApproveRecordModel model);

	SearchResult<ApproveRecordModel> queryStayByCaseId(ParamCondition condition);

	List<ApproveRecordModel> findByCaseId(String caseId);
}
