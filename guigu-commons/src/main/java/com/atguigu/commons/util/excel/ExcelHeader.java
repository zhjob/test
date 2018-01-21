package com.atguigu.commons.util.excel;

import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;

import com.atguigu.commons.util.excel.vo.ExcelDefinition;

/**
 * 导出Excel,标题之前的信息
 * @author zhangyj
 *
 */
public interface ExcelHeader {

	/**
	 * 如何构建标题之前的数据
	 * @param sheet Excel中的sheet页
	 * @param excelDefinition XML中定义的信息
	 * @param beans 导出的数据
	 */
	void buildHeader(Sheet sheet, ExcelDefinition excelDefinition, List<?> beans);
}
