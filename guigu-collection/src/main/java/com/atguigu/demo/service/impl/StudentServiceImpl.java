package com.atguigu.demo.service.impl;

import org.springframework.stereotype.Service;

import com.atguigu.commons.service.AbstractService;
import com.atguigu.demo.model.StudentModel;
import com.atguigu.demo.service.StudentService;

@Service("studentService")
public class StudentServiceImpl extends AbstractService<StudentModel,String> implements StudentService{
	
}
