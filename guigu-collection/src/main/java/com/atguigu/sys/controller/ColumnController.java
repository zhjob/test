package com.atguigu.sys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.collection.service.ColumnService;
import com.atguigu.commons.easyui.Column;
import com.atguigu.commons.web.controller.AbstractController;
import com.atguigu.sys.model.ColumnModel;
import com.atguigu.sys.security.util.SecurityUtil;

/**
 * 动态列 Controller
 * @author lisuo
 *
 */
@Controller
@RequestMapping("sys/column")
public class ColumnController extends AbstractController<ColumnModel,String>{
	
	@Autowired
	private ColumnService columnService;
	
	@ResponseBody
	@RequestMapping(value="caseColumns")
	public List<Column> caseColumns() {
		String userId = SecurityUtil.getCurrentUser().getId();
		List<Column> columns = columnService.findCaseColumnsByUserId(userId);
		return columns;
	}
	
}
