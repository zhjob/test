package com.atguigu.log.service.impl;

import org.springframework.stereotype.Service;

import com.atguigu.commons.service.AbstractService;
import com.atguigu.log.model.UserLogModel;
import com.atguigu.log.service.UserLogService;

/**
 * 日志 Service 实现类
 * @author lisuo
 *
 */
@Service("userLogService")
public class UserLogServiceImpl extends AbstractService<UserLogModel, String> implements UserLogService {
}
