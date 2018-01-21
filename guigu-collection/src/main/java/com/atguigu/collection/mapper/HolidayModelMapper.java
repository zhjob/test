package com.atguigu.collection.mapper;

import java.util.List;

import com.atguigu.collection.model.HolidayModel;

public interface HolidayModelMapper {
    int deleteByPrimaryKey(Integer id);
    int insert(HolidayModel record);
    int insertSelective(HolidayModel record);
    HolidayModel selectByPrimaryKey(Integer id);
    HolidayModel selectByDay(String holiday);
    List<HolidayModel> queryAll();
    int updateByPrimaryKeySelective(HolidayModel record);
    int updateByPrimaryKey(HolidayModel record);
	void deleteAll();
}