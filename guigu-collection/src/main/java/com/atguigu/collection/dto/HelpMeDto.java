package com.atguigu.collection.dto;

import com.atguigu.collection.model.CaseApplyModel;
import com.atguigu.collection.model.CaseBatchModel;
import com.atguigu.collection.model.CaseCarLoanModel;
import com.atguigu.collection.model.CaseModel;
import com.atguigu.collection.model.CasePaid;
import com.atguigu.sys.model.EmployeeInfoModel;
import com.atguigu.sys.model.EntrustModel;

/**
 * 用于协催审批，xml解析
 * @author wcy
 * @date 2016年7月19日14:20:13
 */
@SuppressWarnings("serial")
public class HelpMeDto extends CaseApplyModel{
		/**案件表*/
		private CaseModel caseModel;
		/**委托方表*/
		private EntrustModel entrustModel;
		/**批次表*/
		private CaseBatchModel caseBatchModel;
		/**还款表*/
		private CasePaid casePaidModel;
		/**员工表*/
		private EmployeeInfoModel employeeInfoModel;
		/**车*/
		private CaseCarLoanModel caseCarLoanModel;
		/**已还款*/
		private Double surplusMoney;
		private String entrustId;
		
		public CaseCarLoanModel getCaseCarLoanModel() {
			return caseCarLoanModel;
		}
		public void setCaseCarLoanModel(CaseCarLoanModel caseCarLoanModel) {
			this.caseCarLoanModel = caseCarLoanModel;
		}
		public Double getSurplusMoney() {
			return surplusMoney;
		}
		public void setSurplusMoney(Double surplusMoney) {
			this.surplusMoney = surplusMoney;
		}
		private String isNull;
		
		public CaseModel getCaseModel() {
			return caseModel;
		}
		public void setCaseModel(CaseModel caseModel) {
			this.caseModel = caseModel;
		}
		public EntrustModel getEntrustModel() {
			return entrustModel;
		}
		public void setEntrustModel(EntrustModel entrustModel) {
			this.entrustModel = entrustModel;
		}
		public CaseBatchModel getCaseBatchModel() {
			return caseBatchModel;
		}
		public void setCaseBatchModel(CaseBatchModel caseBatchModel) {
			this.caseBatchModel = caseBatchModel;
		}
		public CasePaid getCasePaidModel() {
			return casePaidModel;
		}
		public void setCasePaidModel(CasePaid casePaidModel) {
			this.casePaidModel = casePaidModel;
		}
		public String getIsNull() {
			return isNull;
		}
		public void setIsNull(String isNull) {
			this.isNull = isNull;
		}
		public EmployeeInfoModel getEmployeeInfoModel() {
			return employeeInfoModel;
		}
		public void setEmployeeInfoModel(EmployeeInfoModel employeeInfoModel) {
			this.employeeInfoModel = employeeInfoModel;
		}
		public String getEntrustId() {
			return entrustId;
		}
		public void setEntrustId(String entrustId) {
			this.entrustId = entrustId;
		}
	
}
