package com.atguigu.collection.service;
import java.util.List;

import com.atguigu.collection.model.AttachmentModel;
import com.atguigu.commons.vo.ParamCondition;
public interface AttachmentService {
	/**
	 * 批量逻辑删除， 不删除实际文件
	 */
	public void mulDelete(String []id) throws Exception;
	public void save(AttachmentModel caseAttachment);
	public List<AttachmentModel> queryAttachmentsByCaseId(String caseId);
	int queryCount(ParamCondition condition);
	public AttachmentModel findById(String id);
}
