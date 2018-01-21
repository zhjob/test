package com.atguigu.collection.dto;

import com.atguigu.collection.model.CaseApplyModel;
import com.atguigu.collection.model.CaseModel;
import com.atguigu.collection.model.SocialSecurityModel;

/**
 * 用于待处理协催---导入，xml解析
 * @author zhangyj
 * @date 2016年7月21日
 *
 */
@SuppressWarnings("serial")
public class SocialSecurityDto extends SocialSecurityModel{
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
