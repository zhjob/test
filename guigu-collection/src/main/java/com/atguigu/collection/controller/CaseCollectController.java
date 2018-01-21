package com.atguigu.collection.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.ArrayUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.collection.dto.CaseCollectViewDto;
import com.atguigu.collection.model.ApproveRecordModel;
import com.atguigu.collection.service.CaseApprovalService;
import com.atguigu.collection.service.CaseCollectService;
import com.atguigu.collection.service.CaseService;
import com.atguigu.collection.service.impl.CaseColorService;
import com.atguigu.collection.vo.CaseCommentVo;
import com.atguigu.commons.util.DateUtil;
import com.atguigu.commons.util.UUIDUtil;
import com.atguigu.commons.vo.AjaxResult;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;
import com.atguigu.commons.web.controller.RestfulUrlController;
import com.atguigu.sys.model.EmployeeInfoModel;
import com.atguigu.sys.model.PositionModel;
import com.atguigu.sys.security.util.SecurityUtil;
import com.atguigu.sys.service.RoleService;

/**
 * @Description: 风控管理
 * @author lidengwen
 * @date 2016年6月23日 上午9:15:15
 */
@Controller
@RequestMapping("collection/casecollect")
public class CaseCollectController extends RestfulUrlController<CaseCollectViewDto, String> {
	
	// 权限码前缀
	private static final String PERMISION_PREFIX = "casecollect";
		
	@Autowired
	private CaseCollectService caseCollectService;
	@Autowired
	private CaseApprovalService caseApprovalservice;
	@Autowired
	private CaseService caseService;
	@Autowired
	private CaseColorService caseColorService;
	
	@Autowired
	private RoleService roleService;
	
	public CaseCollectController() {
		columnNames.put("caseMoney", "case_money");
		columnNames.put("surplusMoney", "surplusMoney");
		columnNames.put("ptpMoney", "ptp_money");
		columnNames.put("cpMoney", "cp_money");
		columnNames.put("paidNum", "paid_num");
		
		
		columnNames.put("caseNum", "cinfo.case_num");
		columnNames.put("caseName", "cinfo.case_name");
		columnNames.put("batchCode", "cbatch.batch_code");
		columnNames.put("caseCode", "cinfo.case_code");
		columnNames.put("state", "cinfo.state");
		
		
		//2016年11月28日13:48:57   我的案件部门案件添加一大波排序
		columnNames.put("caseCard", "cinfo.case_card");
		columnNames.put("entrustName", "entrust.name");
		columnNames.put("beginDate", "cbatch.begin_date");
		columnNames.put("endDate", "cbatch.end_date");
		columnNames.put("lastPhone", "lastPhone");
		columnNames.put("collecStateId", "cinfo.collec_state_id");
		columnNames.put("caseAssignedName", "caseAssigned.user_name ");
		columnNames.put("caseBackdate", "cinfo.case_backdate ");
		columnNames.put("caseDate", "cinfo.case_date ");
	}
	@Override
	protected String getBaseName() {
		return "collection/casecollect/";
	}

	
	/**
	 * 上传页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(value = "upload", method = RequestMethod.GET)
	public ModelAndView upload() {
		return super.createBaseView("upload");
	}

	@RequestMapping(value = "applyStay", method = RequestMethod.GET)
	public ModelAndView applyStay() {
		HttpServletRequest request = this.getRequest();
		ModelAndView view = createBaseView("applyStay");
		String caseId = request.getParameter("caseId");
		view.addObject("caseId", caseId);
		return view;
	}

	@RequestMapping(value = "applyStay", method = RequestMethod.POST)
	@ResponseBody
	public AjaxResult applyStay(String caseId, String reason) {
		ApproveRecordModel model = new ApproveRecordModel();
		model.setApplyEmpId(SecurityUtil.getCurrentUser().getId());
		model.setCaseId(caseId);
		model.setApplyReason(reason);
		Date time = new Date();
		model.setApplyTime(time);
		model.setApproveState(0);
		model.setId(UUIDUtil.UUID32());
		model.setCreateTime(time);
		model.setModifyTime(time);
		model.setCreateEmpId(SecurityUtil.getCurrentUser().getId());
		
		Date caseBackdate = caseService.findById(caseId).getCaseBackdate();
		if(caseBackdate==null){
			caseBackdate=new Date();
		}
		model.setStayTime(DateUtil.addDays(caseBackdate, 30));
		caseApprovalservice.saveApproveRecord(model);
		AjaxResult success = AjaxResult.success(getSuccessMessage());
		return success;
	}

	@RequestMapping(value = "changeState", method = RequestMethod.POST)
	@ResponseBody
	public AjaxResult changeState(@RequestParam("state") Integer state, @RequestParam("caseIds[]") String[] caseIds) {
		AjaxResult success = AjaxResult.success(getSuccessMessage());
		caseCollectService.changeState(state, Arrays.asList(caseIds));
		return success;
	}

	@Override
	public ModelAndView index() {
		ModelAndView view = createBaseView("index");
		PositionModel positionModel = SecurityUtil.getCurrentUser().getPositionModel();
		view.addObject("position", positionModel==null?"":positionModel.getName());
		return view;
	}

	@RequestMapping(value = "assigned", method = RequestMethod.GET)
	public ModelAndView assigned(HttpServletRequest request) {
		ModelAndView view = createBaseView("assigned");
		CaseCommentVo attributeValue = new CaseCommentVo();
		attributeValue.setCaseCommentColor("0");
		view.addObject("caseCommentVo", attributeValue);
		view.addObject("commentColor", caseColorService.getColorMap());
		
		Object begin=request.getParameter("backDateBegin");
		if(begin!=null){
			view.addObject("backDateBegin", begin);
		}
		Object end=request.getParameter("backDateEnd");
		if(end!=null){
			view.addObject("backDateEnd", end);
		}
		return view;
	}

	@RequestMapping(value = "department", method = RequestMethod.GET)
	public ModelAndView department() {
		ModelAndView view = createBaseView("department");
		CaseCommentVo attributeValue = new CaseCommentVo();
		attributeValue.setCaseCommentColor("0");
		view.addObject("caseCommentVo", attributeValue);
		view.addObject("commentColor", caseColorService.getColorMap());
		return view;
	}

	@RequiresPermissions(value = { PERMISION_PREFIX + ":view" })
	@Override
	@RequestMapping(value = QUERY_PAGE, method = RequestMethod.POST)
	public SearchResult<CaseCollectViewDto> queryForPage() {
		ParamCondition condition = parseCondition("*");
		
		//获取当前登陆人的所有角色，查看该登录人是否有权限查看退案
		EmployeeInfoModel empModel=SecurityUtil.getCurrentUser();
		roleService.getOrgCode(empModel.getId(),condition);
		return super.queryForPage(condition);
	}

	@RequestMapping(value = "statistics", method = RequestMethod.POST)
	@ResponseBody
	public AjaxResult statistics() {
		AjaxResult result = AjaxResult.success(getSuccessMessage());
		ParamCondition condition = parseCondition("*");
		

		//获取当前登陆人的所有角色，查看该登录人是否有权限查看退案
		EmployeeInfoModel empModel=SecurityUtil.getCurrentUser();
		roleService.getOrgCode(empModel.getId(),condition);
		
		Map<String, Object> map = caseCollectService.queryStatistics(condition);
		result.setObj(map);
		return result;
	}

	// Excel导出选中案件
	@RequestMapping(value = "/exportSelectedExcel")
	public ModelAndView exportExcel(String[] caseIds) {
		List<CaseCollectViewDto> list = null;
		if (ArrayUtils.isNotEmpty(caseIds)) {
			ParamCondition condition = new ParamCondition();
			condition.put("caseIds", Arrays.asList(caseIds));
			
			//获取当前登陆人的所有角色，查看该登录人是否有权限查看退案
			EmployeeInfoModel empModel=SecurityUtil.getCurrentUser();
			roleService.getOrgCode(empModel.getId(),condition);
			
			list = super.query(condition);
		}
		return super.createExcelView("caseP2p", list, "案件信息列表", null, null);
	}

	// Excel导出选中案件
	@RequestMapping(value = "/exportQueryExcel")
	public ModelAndView exportExcel() {
		ParamCondition condition = parseCondition("*");
		
		//获取当前登陆人的所有角色，查看该登录人是否有权限查看退案
		EmployeeInfoModel empModel=SecurityUtil.getCurrentUser();
		roleService.getOrgCode(empModel.getId(),condition);
				
		List<CaseCollectViewDto> list = super.query(condition);
		return super.createExcelView("caseP2p", list, "案件信息列表", null, null);
	}

	@RequestMapping(value = "/caseState")
	@ResponseBody
	public AjaxResult caseState() {
		//获取当前登陆人的所有角色，查看该登录人是否有权限查看退案
		AjaxResult result = AjaxResult.success(getSuccessMessage());
		EmployeeInfoModel empModel=SecurityUtil.getCurrentUser();
		boolean tf= roleService.getOrgCodeTF(empModel.getId());
		if(tf){
			result.setObj(AjaxResult.CODE_SUCCESS);
		}else{
			result.setObj(AjaxResult.CODE_FAILURE);
		}
		
		return result;
	}

}
