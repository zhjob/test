package com.atguigu.sys.service;

import java.util.List;

import com.atguigu.commons.service.BaseService;
import com.atguigu.sys.model.EntrustModel;

/**
 *  委托方Service
 * @author zhangyj
 */
public interface EntrustService extends BaseService<EntrustModel,String>{
	/**
	 * 启用 停用s
	 * @param model
	 * @return
	 */
	public int updateForStatus(String[] ids);
	
	public int updateForStatusNo(String[] ids);

}
