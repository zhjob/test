package com.atguigu.collection.service;

import com.atguigu.collection.model.MessageReminderModel;
import com.atguigu.commons.service.BaseService;

/**
 * 消息提醒Service

 */
public interface MessageReminderService extends BaseService<MessageReminderModel, String>{

	void readMessageReminderService(String id);

	void saveReminder(String content, int remindType, String remindTarget, String url, String title);

	void deleteMessageReminder(int day);

	

}
