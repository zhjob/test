package com.atguigu.collection.mapper;

import java.util.List;

import com.atguigu.collection.dto.CaseDto;
import com.atguigu.collection.model.ApproveRecordModel;
import com.atguigu.collection.model.HurryRecordModel;
import com.atguigu.collection.model.VisitRecordModel;
import com.atguigu.commons.mapper.BaseMapper;
import com.atguigu.commons.vo.ParamCondition;
/**
 * 审批mapper
 * @author wcy
 * @date 2016年5月24日17:40:42
 *
 */
public interface CaseApprovalMapper extends BaseMapper<CaseDto,String> {
	
	List<CaseDto> queryforGo(ParamCondition condition);
	List<CaseDto> queryforLeave(ParamCondition condition);
	int updatefoApp(ApproveRecordModel model);
	int updatefoVi(VisitRecordModel model);
	int saveOperate(HurryRecordModel model);
	int insert(ApproveRecordModel record);
	CaseDto findStayTime(String caseId);
	List<ApproveRecordModel> queryStay(ParamCondition condition);
	List<ApproveRecordModel> findByCaseId(String caseId);
	
}