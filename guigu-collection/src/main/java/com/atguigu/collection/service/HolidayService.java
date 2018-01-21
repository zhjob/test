package com.atguigu.collection.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.atguigu.collection.exception.HolidayException;
import com.atguigu.collection.model.HolidayModel;

public interface HolidayService {

	List<HolidayModel> queryAll();

	Calendar addDateByWorkDay(Date date, int day);

	void delDay(int id);

	void saveholidays(String[] records) throws HolidayException;

	void clearholiday();

}