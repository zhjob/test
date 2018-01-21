package com.atguigu.quartz.service.impl;

import org.springframework.stereotype.Service;

import com.atguigu.commons.service.AbstractService;
import com.atguigu.quartz.model.TimerTaskLogModel;
import com.atguigu.quartz.service.TimerTaskLogService;

/**
 * 定时任务日志 Service 实现类
 * @author lisuo
 *
 */
@Service("timerTaskLogService")
public class TimerTaskLogServiceImpl extends AbstractService<TimerTaskLogModel, String> implements TimerTaskLogService {
}
