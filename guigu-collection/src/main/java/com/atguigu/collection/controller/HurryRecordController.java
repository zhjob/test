package com.atguigu.collection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.collection.model.HurryRecordModel;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;
import com.atguigu.commons.web.controller.RestfulUrlController;
import com.atguigu.sys.model.DictionaryModel;
import com.atguigu.sys.service.DictionaryService;
import com.atguigu.sys.util.DictUtil;


@Controller
@RequestMapping("collection/hurryrecord")
public class HurryRecordController extends RestfulUrlController<HurryRecordModel,String> {

	@Autowired
	private DictionaryService dictionaryService;
	@Override
	public ModelAndView pageIndex() {
		ModelAndView view = createBaseView(PAGE_INDEX);
		view.addObject("caseId", this.getRequest().getParameter("caseId"));
		return view;
	}
	
	@Override
	public List<HurryRecordModel> list() {
		ParamCondition condition = this.parseCondition("caseId");
		List<HurryRecordModel> list = super.query(condition);
		return list;
	}
	

	/**
	 * 带分页查询
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = QUERY_PAGE, method = RequestMethod.GET)
	public SearchResult<HurryRecordModel> queryForPage() {
		ParamCondition condition = parseCondition("*");
		return super.queryForPage(condition);
	}
	
	@RequestMapping(value = "hurCat")
	@ResponseBody
	public List<DictionaryModel> hurCat(@RequestParam("constName") String constName) {
		List<DictionaryModel> dicts = dictionaryService.findSubsByPath(DictUtil.getPathValue(constName));
		return dicts;
	}
	 
	@Override
	protected String getBaseName() {
		return "collection/hurryrecord/";
	}
	
	
}
