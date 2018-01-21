package com.atguigu.collection.mapper;

import java.util.List;

import com.atguigu.collection.model.AttachmentModel;
import com.atguigu.commons.vo.ParamCondition;

public interface AttachmentMapper {
    int deleteById(String id);
    int insert(AttachmentModel record);
    AttachmentModel findById(String id);
    int updateById(AttachmentModel record);
	List<AttachmentModel> findByCaseId(String caseId);
	void mulUpdate(String[] id);
	int queryCount(ParamCondition condition);
}