package com.atguigu.collection.service;

import com.atguigu.collection.model.TargetAchieve;
import com.atguigu.commons.service.BaseService;

/**
 * service
 * @author zhangyj
 *
 */
public interface TargetAchieveService extends BaseService<TargetAchieve,String>{
	TargetAchieve findByEmpId(String userId, int year, int month);
	int queryTargetArchive();

}
