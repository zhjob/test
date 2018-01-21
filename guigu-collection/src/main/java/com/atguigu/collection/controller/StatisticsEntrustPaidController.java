package com.atguigu.collection.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.collection.dto.CaseCollectViewDto;
import com.atguigu.collection.dto.ControllerMessageDto;
import com.atguigu.collection.dto.HelpMeDto;
import com.atguigu.collection.dto.StatisticsEntrustDto;
import com.atguigu.collection.dto.VisitShowView;
import com.atguigu.collection.service.StatisticsEntrustService;
import com.atguigu.collection.service.StatisticsService;
import com.atguigu.collection.view.VisitDocView;
import com.atguigu.commons.util.NumberUtil;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;
import com.atguigu.commons.web.controller.RestfulUrlController;
import com.atguigu.sys.model.VisitTemplateModel;
/**
 * 
 * @author zhangyj
 *
 */
@Controller
@RequestMapping("collection/statisticsEntrustPaid")
public class StatisticsEntrustPaidController extends RestfulUrlController<StatisticsEntrustDto, String> {

	@Autowired
	private StatisticsEntrustService statisticsService;
	/**
	 * 委托方统计展示方法
	 */
	@RequestMapping(value = "queryEntrustPaid")
	@ResponseBody
	public SearchResult<StatisticsEntrustDto> queryEntrust() {
		ParamCondition condition = parseCondition("*");
		
		String entrustId=condition.get("entrustId");
		if (StringUtils.isNotBlank(entrustId)) {
			String[] entrustIds = entrustId.split(",");
			condition.put("entrustIds", entrustIds);
		}
		
		SearchResult<StatisticsEntrustDto> queryEntrust = statisticsService.queryEntrustPaid(condition);
		List<StatisticsEntrustDto> list = queryEntrust.getRows();
		List<StatisticsEntrustDto> footer = new ArrayList<StatisticsEntrustDto>();
		StatisticsEntrustDto dto = new StatisticsEntrustDto();
		
		for (StatisticsEntrustDto entrustDto : list) {
			
			dto.setCase_count(entrustDto.getCase_count()+dto.getCase_count());
			dto.setCp_money(entrustDto.getCp_money()+ dto.getCp_money());
			dto.setPaid_num(entrustDto.getPaid_num()+dto.getPaid_num());
			dto.setTotal_case_money(entrustDto.getTotal_case_money()+dto.getTotal_case_money());
			dto.setLa_count(entrustDto.getLa_count()+dto.getLa_count());
			dto.setLa_case_money(entrustDto.getLa_case_money()+dto.getLa_case_money());

			dto.setCp_case_count(entrustDto.getCp_case_count()+dto.getCp_case_count());
			dto.setPaid_case_count(entrustDto.getPaid_case_count()+dto.getPaid_case_count());
			dto.setPtp_money(entrustDto.getPtp_money()+dto.getPtp_money());
			dto.setPtp_case_count(entrustDto.getPtp_case_count()+dto.getPtp_case_count());
			dto.setZlz_paid_num(entrustDto.getZlz_paid_num()+dto.getZlz_paid_num());
			dto.setZlz_paid_case_count(entrustDto.getZlz_paid_case_count()+dto.getZlz_paid_case_count());
		}
		dto.setPaid_rate("—");
		dto.setPaid_count_rate("—");
		dto.setAverage_count("—");
		dto.setPaid_money_rate("—");
		
			dto.setName("合计");
	footer.add(dto);
	queryEntrust.setFooter(footer);
		
		return queryEntrust;
	}
	
	/** 导出所选委托方统计 */
	@RequestMapping(value = "/exportSelected")
	public ModelAndView exportSelected(String[] ids){
		List<StatisticsEntrustDto> list=statisticsService.queryExport(Arrays.asList(ids));
		return super.createExcelView("statisticsEntrust", list, "所选委托方统计", null, null);
	}
	

	/** 导出所查委托方统计 */
	@RequestMapping(value="/exportQueryExcel",method=RequestMethod.POST)
	public ModelAndView exportExcel(){
		ParamCondition condition = parseCondition("*");
		List<StatisticsEntrustDto> list=statisticsService.exportQueryExcel(condition);
		StatisticsEntrustDto dto = new StatisticsEntrustDto();
		for (StatisticsEntrustDto entrustDto : list) {
			dto.setAchieve(entrustDto.getAchieve()+dto.getAchieve());
			dto.setCase_count(entrustDto.getCase_count()+dto.getCase_count());
			dto.setCp_money(entrustDto.getCp_money()+ dto.getCp_money());
			dto.setFamily_case_count(entrustDto.getFamily_case_count()+dto.getFamily_case_count());
			dto.setInvolve_case_count(entrustDto.getInvolve_case_count()+dto.getInvolve_case_count());
			dto.setLose_case_count(entrustDto.getLose_case_count()+dto.getLose_case_count());
			dto.setNegotiation_case_count(entrustDto.getNegotiation_case_count()+dto.getNegotiation_case_count());
			dto.setNew_case_count(entrustDto.getNew_case_count()+dto.getNew_case_count());
			dto.setOneself_case_count(entrustDto.getOneself_case_count()+dto.getOneself_case_count());
			dto.setPaid_num(entrustDto.getPaid_num()+dto.getPaid_num());
			dto.setPtp_money(entrustDto.getPtp_money()+dto.getPtp_money());
			dto.setSomeone_case_count(entrustDto.getSomeone_case_count()+dto.getSomeone_case_count());
			dto.setTarget(entrustDto.getTarget()+dto.getTarget());
			dto.setTotal_case_money(entrustDto.getTotal_case_money()+dto.getTotal_case_money());
			dto.setName("合计");
	}
		list.add(dto);
		return super.createExcelView("statisticsEntrust", list, "所查委托方统计", null, null);
	}

	

	
	@Override
	protected String getBaseName() {
		return "collection/statisticsEntrustPaid/";
	}

}
