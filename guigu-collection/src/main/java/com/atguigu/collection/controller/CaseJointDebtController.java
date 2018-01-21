package com.atguigu.collection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.collection.service.CaseJointDebtService;
import com.atguigu.collection.vo.CaseJointDebtVo;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;
import com.atguigu.commons.web.controller.SimpleController;

@Controller
@RequestMapping("collection/jointdebt")
public class CaseJointDebtController extends SimpleController {
	@Autowired
	private CaseJointDebtService caseJointDebtService;

	/**
	 * 带分页查询
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = QUERY_PAGE, method = RequestMethod.GET)
	public SearchResult<CaseJointDebtVo> queryForPage() {
		ParamCondition condition = parseCondition("*");
		SearchResult<CaseJointDebtVo> result = caseJointDebtService.query(condition);
		return result;
	}

	@RequestMapping(value = PAGE_INDEX, method = RequestMethod.GET)
	public ModelAndView pageInput() {
		String caseId = this.getRequest().getParameter("caseId");
		ModelAndView modelAndView = new ModelAndView("collection/jointdebt/index");
		modelAndView.addObject("caseId", caseId);
		return modelAndView;
	}

}
