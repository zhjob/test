package com.atguigu.collection.mapper;

import com.atguigu.collection.dto.CaseDetailDto;

public interface CaseDetailMapper {
	public CaseDetailDto queryDetailByCaseId(String id);
}