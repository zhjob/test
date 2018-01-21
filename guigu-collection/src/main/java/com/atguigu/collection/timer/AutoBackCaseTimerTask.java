package com.atguigu.collection.timer;

import java.util.concurrent.atomic.AtomicBoolean;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.atguigu.collection.timer.handler.AutoBackCaseHandler;
import com.atguigu.commons.web.filter.SpringUtil;
import com.atguigu.quartz.timer.BaseTimerTask;

/**
 * 自动退案Timer
 * @author lisuo
 *
 */
public class AutoBackCaseTimerTask extends BaseTimerTask{
	
	private AutoBackCaseHandler autoBackCaseHandler = SpringUtil.getBean(AutoBackCaseHandler.class);
	private static AtomicBoolean isWorking = new AtomicBoolean(false);
	
	
	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		try{
			if(!isWorking.get()){
				isWorking.set(true);
				autoBackCaseHandler.autoBackCase();
			}else{
				if(log.isDebugEnabled()){
					log.debug("自动退案Timer 正在工作");
				}
			}
		}finally{
			isWorking.set(false);
		}
	}
	
	
}
