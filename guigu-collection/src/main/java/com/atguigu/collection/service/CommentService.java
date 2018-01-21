package com.atguigu.collection.service;

import com.atguigu.collection.model.CommentModel;
import com.atguigu.commons.service.BaseService;
public interface CommentService extends BaseService<CommentModel,String>{

	void saveCommentAndUpdateCaseColor(String[] ids, String content, String color, boolean isBatch);
}


