package com.atguigu.collection.mapper;

import java.util.List;
import java.util.Map;

import com.atguigu.collection.dto.ApproveDto;
import com.atguigu.collection.dto.VisitDto;
import com.atguigu.collection.model.ApproveRecordModel;
import com.atguigu.collection.model.VisitRecordModel;
import com.atguigu.commons.mapper.BaseMapper;
import com.atguigu.commons.vo.ParamCondition;
/**
 * 审批mapper
 * @author wcy
 * @date 2016年5月24日17:40:42
 *
 */
public interface CaseApprovalLeaveMapper extends BaseMapper<ApproveDto,String> {
	/** 查询申请外访数据*/
	List<ApproveDto> queryforLeave(ParamCondition condition);
	int approvalYes(Map<String, Object> params);
	List<ApproveRecordModel> findIds(List<String> list);
	
}