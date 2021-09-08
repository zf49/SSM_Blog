package com.zf.service;

import com.zf.pojo.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleService {

    List<Article> getAllArticle();
    List<Article> getArticleByUserId(@Param("userId") int userId);

    Article getArticleByArticleId(@Param("id") int id);
    List<Article> getAllArticleContentName();
    int deleteArticle(@Param("articleId") int id);
    int addArticle(Article article);


}
