package com.atguigu.sys.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.junit.runners.Parameterized.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.commons.easyui.Combobox;
import com.atguigu.commons.util.CoreUtil;
import com.atguigu.commons.vo.AjaxResult;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;
import com.atguigu.commons.web.controller.RestfulUrlController;
import com.atguigu.sys.dto.EntrustVisitDto;
import com.atguigu.sys.mapper.EntrustMapper;
import com.atguigu.sys.model.EmployeeInfoModel;
import com.atguigu.sys.model.EntrustModel;
import com.atguigu.sys.model.EntrustVisit;
import com.atguigu.sys.security.util.SecurityUtil;
import com.atguigu.sys.service.EntrustVisitService;

/**
 * 委托方 Controller
 * @author zhangyj
 * @date 2016.6.1
 */
@Controller
@RequestMapping("sys/entrustVisit")
public class EntrustVisitController extends RestfulUrlController<EntrustVisitDto,String> {
	// 权限码前缀
	private static final String PERMISION_PREFIX = "entrustVisit";
	@Autowired
	private EntrustVisitService entrustService;
	
	@RequiresPermissions(value = { PERMISION_PREFIX + ":view" })
	@Override
	public ModelAndView index() {
		// TODO Auto-generated method stub
		return super.index();
	}
	
	
	@RequestMapping(value = "visitView", method = RequestMethod.GET)
	public ModelAndView visitView(@RequestParam String id){
		//根据产品id 查询
		List<EntrustVisit> model= entrustService.findByProductId(id);
		ModelAndView view =createBaseView("visitView");
		view.addObject("model", model);
		return view;
	}
	
	@RequiresPermissions(value = { PERMISION_PREFIX + ":save" })
	@Override
	public AjaxResult save(EntrustVisitDto model) {
		// TODO Auto-generated method stub
		return super.save(model);
	}
	@RequiresPermissions(value = { PERMISION_PREFIX + ":update" })
	@Override
	public AjaxResult update(EntrustVisitDto model) {
		// TODO Auto-generated method stub
		return super.update(model);
	}
	
	
	
	@Override
	public SearchResult<EntrustVisitDto> queryForPage() {
		ParamCondition condition = parseCondition("*");

		return super.queryForPage(condition);
	}
    
	@Override
	protected String getBaseName() {
		return "sys/entrustVisit/";
	}
	
	
	
}
