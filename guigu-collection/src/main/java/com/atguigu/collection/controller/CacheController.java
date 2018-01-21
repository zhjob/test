package com.atguigu.collection.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.atguigu.collection.dto.VisitRecordDto;
import com.atguigu.collection.dto.VisitShowView;
import com.atguigu.collection.model.VisitRecordModel;
import com.atguigu.collection.service.VisitRecordService;
import com.atguigu.collection.view.VisitDocView;
import com.atguigu.commons.easyui.Combobox;
import com.atguigu.commons.easyui.SelectType;
import com.atguigu.commons.util.DateUtil;
import com.atguigu.commons.vo.AjaxResult;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;
import com.atguigu.commons.web.controller.RestfulUrlController;
import com.atguigu.sys.model.EmployeeInfoModel;
import com.atguigu.sys.model.VisitTemplateModel;
import com.atguigu.sys.security.util.SecurityUtil;
import com.atguigu.sys.service.EmployeeInfoService;
import com.atguigu.sys.service.VisitTemplateService;

@Controller
@RequestMapping("collection/cache")
public class CacheController extends RestfulUrlController<VisitRecordModel, String> {
	@Autowired
	private EmployeeInfoService employeeInfoService;
	@Autowired
	private CacheManager cm;
	@RequestMapping(value = "findEmpsByOrg")
	@ResponseBody
	public List<EmployeeInfoModel> getCurrentOrgVisitor() {
		List<EmployeeInfoModel> emps = employeeInfoService.findEmpsByOrg(SecurityUtil.getCurrentUser().getOrgId());
		return emps;
	}

	@RequestMapping(value = "updateEmp")
	@ResponseBody
	public void updateEmp() {
		employeeInfoService.updateForStatus(new String[] {"1"});
	}
	
	

	@RequestMapping(value = "/delCache")
	@ResponseBody
	public String delCache(String cacheName) throws IOException {

		Cache uCache = cm.getCache(cacheName);
		uCache.clear();
		return new JSONObject().toJSONString();
	}

}
