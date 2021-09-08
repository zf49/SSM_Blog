package com.zf.service;

import com.zf.pojo.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentService {

    List<Comment> getArticleComment(@Param("articleId") int articleId);

}
