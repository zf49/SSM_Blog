package com.zf.service;


import com.zf.dao.ArticleMapper;
import com.zf.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    public void setArticleMapper(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }

    public List<Article> getAllArticle() {
        return articleMapper.getAllArticle();
    }

    public List<Article> getArticleByUserId(int userId) {
        return articleMapper.getArticleByUserId(userId);
    }

    public Article getArticleByArticleId(int id) {
        return articleMapper.getArticleByArticleId(id);
    }


}
