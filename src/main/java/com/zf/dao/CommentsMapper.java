package com.zf.dao;

import com.zf.pojo.Comment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentsMapper {

    List<Comment> getArticleComment(@Param("articleId") int articleId);

    int addComment(Comment comment);

}
