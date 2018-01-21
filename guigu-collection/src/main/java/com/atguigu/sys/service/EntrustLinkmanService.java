package com.atguigu.sys.service;

import java.util.List;

import com.atguigu.commons.easyui.Combobox;
import com.atguigu.commons.service.BaseService;
import com.atguigu.sys.dto.EntrustLinKmanDto;
import com.atguigu.sys.model.EntrustLinkman;

/**
 *  委托方Service
 * @author zhangyj
 */
public interface EntrustLinkmanService extends BaseService<EntrustLinKmanDto,String>{
	
	List<Combobox> combobox(String entrustNameValue);

}
