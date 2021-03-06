package com.atguigu.collection.controller;


import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.collection.dto.StatisticsBatchDto;
import com.atguigu.collection.service.StatisticsService;
import com.atguigu.commons.util.NumberUtil;
import com.atguigu.commons.vo.ParamCondition;
import com.atguigu.commons.vo.SearchResult;
import com.atguigu.commons.web.controller.RestfulUrlController;
/**
 * 
 * @author zhangyj
 *
 */
@Controller
@RequestMapping("collection/statisticsBatchPaid")
public class StatisticsBatchPaidController extends RestfulUrlController<StatisticsBatchDto, String> {

	@Autowired
	private StatisticsService statisticsService;

	/**
	 * 批次统计展示方法
	 */
	@RequestMapping(value = "queryBatchPaid")
	@ResponseBody
	public SearchResult<StatisticsBatchDto> queryBatch() {
		ParamCondition condition = parseCondition("*");
		SearchResult<StatisticsBatchDto> queryBatch = statisticsService.queryBatchPaid(condition);
		List<StatisticsBatchDto> list = queryBatch.getRows();
		List<StatisticsBatchDto> footer = new ArrayList<StatisticsBatchDto>();
		StatisticsBatchDto dto = new StatisticsBatchDto();
		for (StatisticsBatchDto batchDto : list) {
			dto.setCase_count(batchDto.getCase_count()+dto.getCase_count());
			dto.setCp_money(batchDto.getCp_money()+ dto.getCp_money());
			dto.setPaid_num(batchDto.getPaid_num()+dto.getPaid_num());
			dto.setTotal_case_money(batchDto.getTotal_case_money()+dto.getTotal_case_money());
			dto.setLa_count(batchDto.getLa_count()+dto.getLa_count());
			dto.setLa_case_money(batchDto.getLa_case_money()+dto.getLa_case_money());
			//dto.setAverage_count(NumberUtil.doubleDivide(dto.getTotal_case_money(), dto.getCase_count(), 2));
			
			dto.setCp_case_count(batchDto.getCp_case_count()+dto.getCp_case_count());
			dto.setPaid_case_count(batchDto.getPaid_case_count()+dto.getPaid_case_count());
			dto.setPtp_money(batchDto.getPtp_money()+dto.getPtp_money());
			dto.setPtp_case_count(batchDto.getPtp_case_count()+dto.getPtp_case_count());
			dto.setZlz_paid_num(batchDto.getZlz_paid_num()+dto.getZlz_paid_num());
			dto.setZlz_paid_case_count(batchDto.getZlz_paid_case_count()+dto.getZlz_paid_case_count());
		}
		dto.setPaid_rate("—");
		dto.setAverage_count("—");
		dto.setPaid_count_rate("—");
		dto.setPaid_money_rate("—");
		dto.setBatch_code("合计");
		footer.add(dto);
		queryBatch.setFooter(footer);
		return queryBatch;
	}

	/** 导出所选委托方统计 */
	@RequestMapping(value = "/exportSelected")
	public ModelAndView exportSelected(String[] ids){
		List<StatisticsBatchDto> list=statisticsService.queryExport(Arrays.asList(ids));
		return super.createExcelView("statisticsBatch", list, "所选批次统计", null, null);
	}

	/** 导出所查委托方统计 */
	@RequestMapping(value="/exportQueryExcel",method=RequestMethod.POST)
	public ModelAndView exportExcel(){
		ParamCondition condition = parseCondition("*");
		List<StatisticsBatchDto> list=statisticsService.exportQueryExcel(condition);
		StatisticsBatchDto dto = new StatisticsBatchDto();
		for (StatisticsBatchDto batchDto : list) {
				dto.setAchieve(batchDto.getAchieve()+dto.getAchieve());
				dto.setCase_count(batchDto.getCase_count()+dto.getCase_count());
				dto.setCp_money(batchDto.getCp_money()+ dto.getCp_money());
				dto.setFamily_case_count(batchDto.getFamily_case_count()+dto.getFamily_case_count());
				dto.setInvolve_case_count(batchDto.getInvolve_case_count()+dto.getInvolve_case_count());
				dto.setLose_case_count(batchDto.getLose_case_count()+dto.getLose_case_count());
				dto.setNegotiation_case_count(batchDto.getNegotiation_case_count()+dto.getNegotiation_case_count());
				dto.setNew_case_count(batchDto.getNew_case_count()+dto.getNew_case_count());
				dto.setOneself_case_count(batchDto.getOneself_case_count()+dto.getOneself_case_count());
				dto.setPaid_num(batchDto.getPaid_num()+dto.getPaid_num());
				dto.setPtp_money(batchDto.getPtp_money()+dto.getPtp_money());
				dto.setSomeone_case_count(batchDto.getSomeone_case_count()+dto.getSomeone_case_count());
				dto.setTarget(batchDto.getTarget()+dto.getTarget());
				dto.setTotal_case_money(batchDto.getTotal_case_money()+dto.getTotal_case_money());
				dto.setBatch_code("合计");
		}
		list.add(dto);
		return super.createExcelView("statisticsBatch", list, "所查批次统计", null, null);
	}
	

	@Override
	protected String getBaseName() {
		return "collection/statisticsBatchPaid/";
	}

}
