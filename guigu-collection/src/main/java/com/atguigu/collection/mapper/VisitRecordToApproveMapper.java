package com.atguigu.collection.mapper;

import java.util.List;
import java.util.Map;

import com.atguigu.collection.dto.VisitDto;
import com.atguigu.collection.model.VisitRecordModel;
import com.atguigu.commons.mapper.BaseMapper;

public interface VisitRecordToApproveMapper extends BaseMapper<VisitDto,String> {
	/** 批量修改外访数据*/
	int updatefoVi(Map<String, Object> params);
	/** 根据外访Id查询案件id*/
	List<VisitRecordModel> findIds(List<String> list);
	
}