package com.atguigu.collection.dto;

import com.atguigu.collection.model.AddressModel;
import com.atguigu.collection.model.ApproveRecordModel;
import com.atguigu.collection.model.AreaModel;
import com.atguigu.collection.model.CaseApplyModel;
import com.atguigu.collection.model.CaseBatchModel;
import com.atguigu.collection.model.CaseModel;
import com.atguigu.collection.model.CasePaid;
import com.atguigu.collection.model.CensusRegisterModel;
import com.atguigu.collection.model.VisitRecordModel;
import com.atguigu.sys.model.EmployeeInfoModel;
import com.atguigu.sys.model.EntrustModel;

/**
 * 用于待处理协催---导入，xml解析
 * @author zhangyj
 * @date 2016年7月21日
 *
 */
@SuppressWarnings("serial")
public class CensusRegisterDto extends CensusRegisterModel{
	
	/**
	 * 案件信息表
	 */
	private CaseModel caseModel;
	/**
	 * 协催申请表
	 */
	private CaseApplyModel caseApply;
	
	
	public CaseModel getCaseModel() {
		return caseModel;
	}
	public void setCaseModel(CaseModel caseModel) {
		this.caseModel = caseModel;
	}
	public CaseApplyModel getCaseApply() {
		return caseApply;
	}
	public void setCaseApply(CaseApplyModel caseApply) {
		this.caseApply = caseApply;
	}

}
