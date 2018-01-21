package com.atguigu.collection.dto;
import com.atguigu.collection.model.ApproveRecordModel;
import com.atguigu.collection.model.CaseBatchModel;
import com.atguigu.collection.model.CaseModel;
import com.atguigu.collection.model.CasePaid;
import com.atguigu.collection.model.VisitRecordModel;
import com.atguigu.sys.model.EmployeeInfoModel;

/**

 *
 */
@SuppressWarnings("serial")
public class ApproveDto extends ApproveRecordModel{
	
	private CaseModel caseModel;   // 案件表
	private CaseBatchModel batchmodel;   // 批次表
	private CasePaid casepaidmodel;   //支付表
	private EmployeeInfoModel employeeInfo;//员工表
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
	public CasePaid getCasepaidmodel() {
		return casepaidmodel;
	}
	public void setCasepaidmodel(CasePaid casepaidmodel) {
		this.casepaidmodel = casepaidmodel;
	}
	public EmployeeInfoModel getEmployeeInfo() {
		return employeeInfo;
	}
	public void setEmployeeInfo(EmployeeInfoModel employeeInfo) {
		this.employeeInfo = employeeInfo;
	}
	
}
