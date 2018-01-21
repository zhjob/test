package com.atguigu.log;

import com.atguigu.commons.util.CcUtil;
import com.atguigu.commons.web.filter.SpringUtil;
import com.atguigu.log.model.UserLogModel;
import com.atguigu.log.service.UserLogService;

/**
 * 日志工具类
 * @author lisuo
 *
 */
public abstract class LogUtil {
	
	private static UserLogService userLogService = SpringUtil.getBean(UserLogService.class);
	
	/**
	 * 保存用户日志
	 * @param useLog
	 */
	public static void saveUserLog(final UserLogModel useLog){
		CcUtil.asyncRun(new Runnable() {
			@Override
			public void run() {
				userLogService.save(useLog);
			}
		});
	}
}
