package com.atguigu.collection.service;


import java.util.List;

import com.atguigu.collection.dto.CaseApplyDto;
import com.atguigu.collection.dto.HelpMeDto;
import com.atguigu.collection.model.CaseApply;
import com.atguigu.collection.model.CaseApplyModel;
import com.atguigu.collection.model.CensusRegisterModel;
import com.atguigu.collection.model.ExpressModel;
import com.atguigu.collection.model.SocialSecurityModel;
import com.atguigu.collection.model.TelecomModel;
import com.atguigu.commons.service.BaseService;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;


/**
 * 待审批协催
 * service
 * @author wcy
 * @date 2016年7月19日10:58:33
 */
public interface HelpMeService  extends BaseService<HelpMeDto, String> {
	/** 待审批协催审批 */
	int agree(CaseApplyModel model,int bs);
	
	/** 待处理协催审批 */
	SearchResult<HelpMeDto> querydeal(ParamCondition condition);
	
	/** 协催记录 */
	SearchResult<HelpMeDto> queryrecord(ParamCondition condition);
	
	/** 导入协催 
	 * @return */
	CaseApply importExcelData(List<CaseApplyDto> listBean, String caseApplyId, String type);
	
	/** 导出户籍  */
	List<HelpMeDto> queryExport(List<String> caseIds);
	
	/** 给历史表里 添加操作记录（快递）  */
	void hurryRecordKD(ExpressModel model);

	/** 给历史表里 添加操作记录（户籍）  */
	void hurryRecordHj(CensusRegisterModel model);
	
	/** 给历史表里 添加操作记录（社保）  */
	void hurryRecordSB(SocialSecurityModel model);
	
	/** 给历史表里 添加操作记录（电信）  */
	void hurryRecordDX(TelecomModel model);

	int queryChaziToApproveCount();

	int querydealCount();

}


