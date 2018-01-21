package com.atguigu.quartz.service;

import com.atguigu.commons.service.BaseService;
import com.atguigu.quartz.model.TimerTaskModel;

/**
 * 定时任务 Service
 * @author lisuo
 *
 */
public interface TimerTaskService extends BaseService<TimerTaskModel, String> {

	/**
	 * 立即执行一次当前Job
	 * @param model
	 */
	public void runJob(TimerTaskModel model);
	
}
