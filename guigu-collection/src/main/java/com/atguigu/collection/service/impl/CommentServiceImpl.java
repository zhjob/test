package com.atguigu.collection.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.collection.mapper.CaseMapper;
import com.atguigu.collection.model.CaseModel;
import com.atguigu.collection.model.CommentModel;
import com.atguigu.collection.service.CommentService;
import com.atguigu.collection.service.MessageReminderService;
import com.atguigu.commons.service.AbstractService;
import com.atguigu.commons.util.UUIDUtil;
import com.atguigu.sys.model.EmployeeInfoModel;
import com.atguigu.sys.security.util.SecurityUtil;

@Service
public class CommentServiceImpl extends AbstractService<CommentModel, String> implements CommentService {

	@Autowired
	private CaseMapper caseMapper;
	@Autowired
	private CaseColorService caseColorService;
	@Autowired
	private MessageReminderService messageReminderService;

	@Override
	public CommentModel save(CommentModel model) {
		EmployeeInfoModel user = SecurityUtil.getCurrentUser();
		model.setId(UUIDUtil.UUID32());
		model.setUserName(user.getUserName());
		model.setCreateEmpId(user.getId());
		Date date = new Date();
		model.setCommentTime(date);
		model.setCreateTime(date);
		model.setStatus(1);
		CommentModel commentModel = super.save(model);
		
		CaseModel caseModel = caseMapper.findById(model.getCaseId());
		messageReminderService.saveReminder("案件["+caseModel.getCaseCode()+"]新增评语", 0, caseModel.getCaseAssignedId(), "/collection/casedetail?caseId="+caseModel.getId(),"案件详情");
		return commentModel;
	}

	@Override
	public void saveCommentAndUpdateCaseColor(String[] ids, String content, String color, boolean isBatch) {

		if (ids != null) {
			for (String caseId : ids) {
				CommentModel cm = new CommentModel();
				cm.setContent(content);
				cm.setCaseId(caseId);
				this.save(cm);
			}
			if (color==null) {
				return;
			}
			
			if (isBatch) {
				caseColorService.updateCaseColor(ids, color);
			} else {
				CaseModel caseInfo = caseMapper.findById(ids[0]);
				if ((caseInfo.getColor() == null)||caseInfo.getColor() != null && !caseInfo.getColor().equals(color)) {
					caseColorService.updateCaseColor(new String[] { ids[0] }, color);
				}
			}

		}

	}

}
