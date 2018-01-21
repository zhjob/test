package com.atguigu.collection.service;

import java.util.List;

import com.atguigu.collection.dto.VisitRecordDto;
import com.atguigu.collection.dto.VisitRecordVo;
import com.atguigu.collection.dto.VisitShowView;
import com.atguigu.collection.model.VisitRecordModel;
import com.atguigu.commons.service.BaseService;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;

public interface VisitRecordService extends BaseService<VisitRecordModel, String> {

	void applyToVisit(VisitRecordModel model, String addressId);

	/**
	 * 外访 待审批 待排程
	 * 
	 * @param condition
	 * @return
	 */
	public SearchResult<VisitRecordDto> queryToApproveORToAppoint(ParamCondition condition);

	/**
	 * 外访  已排程外访 已完成外访
	 * 
	 * @param condition
	 * @return
	 */
	public SearchResult<VisitRecordDto> queryAppointedORFinished(ParamCondition condition);

	public List<VisitRecordDto> seletAll(ParamCondition condition);

	/**
	 * 外访 指定外访员 
	 */
	void appointVisitor(VisitRecordModel model);
	/**
	 * 外访 指定外访员(批量)
	 */
	void appointVisitorBatch(List<VisitRecordModel> list);

	List<VisitShowView> findVisitRecordIds(List<String> visitRecordIds);

	List<VisitShowView> queryAll(ParamCondition condition);

	SearchResult<VisitRecordVo> queryVisitRecordVoForPage(ParamCondition condition);

	/**
	 * 完成外访
	 * 
	 * @param state
	 * @param model
	 * @return
	 */
	void finishVisit(VisitRecordModel model);

	/**
	 * 
	 * cancelVisit 撤销外访
	 */
	void cancelVisit(String[] id, String approveOpinion);

	void backToAppoint(String[] id);

	/**
	 * 查询所选外访
	 * 
	 * @param model
	 * @return
	 */
	List<VisitRecordDto> selectByIds(List<String> ids);

	/**
	 * @Title: 是否有催收员或外访员角色
	 */
	public boolean isCollectorOrVisitor();

	public int queryTomorrowVisitCount();
	
	int queryTodayVisitCount();
	
	public List<VisitRecordDto> queryCaseToUploadReport();

	int queryToApproveORToAppointCount(int state);
	
	VisitRecordModel findByAddresId(String id);

	

}
