package com.atguigu.collection.dto;

import java.math.BigDecimal;

import com.atguigu.collection.model.CaseBatchModel;
import com.atguigu.collection.model.CaseModel;
import com.atguigu.collection.model.VisitRecordModel;
import com.atguigu.sys.model.EmployeeInfoModel;

/**

 *
 */
@SuppressWarnings("serial")
public class VisitDto extends VisitRecordModel {

	private CaseModel caseModel; // 案件表
	private CaseBatchModel batchmodel; // 批次表
	private EmployeeInfoModel employeeInfo;// 员工表
	/** 剩余金额 */
	private BigDecimal surplusMoney;
	/** 已还款 */
	private BigDecimal paidNum;

	public CaseModel getCaseModel() {
		return caseModel;
	}

	public void setCaseModel(CaseModel caseModel) {
		this.caseModel = caseModel;
	}

	public CaseBatchModel getBatchmodel() {
		return batchmodel;
	}

	public void setBatchmodel(CaseBatchModel batchmodel) {
		this.batchmodel = batchmodel;
	}

	public EmployeeInfoModel getEmployeeInfo() {
		return employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfoModel employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

	public BigDecimal getSurplusMoney() {
		return surplusMoney;
	}

	public void setSurplusMoney(BigDecimal surplusMoney) {
		this.surplusMoney = surplusMoney;
	}

	public BigDecimal getPaidNum() {
		return paidNum;
	}

	public void setPaidNum(BigDecimal paidNum) {
		this.paidNum = paidNum;
	}

}
