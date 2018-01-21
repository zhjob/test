package com.atguigu.collection.mapper;

import org.apache.ibatis.annotations.Param;

import com.atguigu.collection.model.TargetAchieve;
import com.atguigu.commons.mapper.BaseMapper;

/**
 * mapper
 * 
 * @author zhangyj
 *
 */
public interface TargetAchieveMapper extends BaseMapper<TargetAchieve, String>  {

    int deleteByPrimaryKey(String id);

    int insert(TargetAchieve record);

    int insertSelective(TargetAchieve record);

    TargetAchieve selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TargetAchieve record);

    int updateByPrimaryKey(TargetAchieve record);

	TargetAchieve findByEmpId(@Param(value="empId") String empId, @Param(value="year") int year, @Param(value="month") int month);

	int queryTargetArchive(@Param(value="year") int year,@Param(value="month")  int month,@Param(value="orgId")  String orgId); 
}