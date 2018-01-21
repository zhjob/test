package com.atguigu.log.service.impl;

import org.springframework.stereotype.Service;

import com.atguigu.commons.service.AbstractService;
import com.atguigu.log.model.LogModel;
import com.atguigu.log.service.LogService;

/**
 * 日志 Service 实现类
 * @author lisuo
 *
 */
@Service("logService")
public class LogServiceImpl extends AbstractService<LogModel, String> implements LogService {
}
