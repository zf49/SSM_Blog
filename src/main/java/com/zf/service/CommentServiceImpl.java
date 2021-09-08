package com.zf.service;

import com.zf.dao.CommentsMapper;
import com.zf.pojo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentsMapper commentsMapper;

    public void setCommentsMapper(CommentsMapper commentsMapper) {
        this.commentsMapper = commentsMapper;
    }

    public List<Comment> getArticleComment(int articleId) {
        return commentsMapper.getArticleComment(articleId);
    }
}
