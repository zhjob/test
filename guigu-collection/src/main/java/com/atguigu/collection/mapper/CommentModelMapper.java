package com.atguigu.collection.mapper;

import com.atguigu.collection.model.CommentModel;
import com.atguigu.commons.mapper.BaseMapper;

public interface CommentModelMapper extends BaseMapper<CommentModel, String> {
    int deleteByPrimaryKey(String id);

    int insert(CommentModel record);

    int insertSelective(CommentModel record);

    CommentModel selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CommentModel record);

    int updateByPrimaryKey(CommentModel record);
}