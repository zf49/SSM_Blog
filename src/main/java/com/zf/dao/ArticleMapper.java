package com.zf.dao;

import com.zf.pojo.Article;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleMapper {

       List<Article> getAllArticle();

       List<Article> getAllArticleContentName();

       List<Article> getArticleByUserId(@Param("userId") int id);

       Article getArticleByArticleId(@Param("id") int id);

       int deleteArticle(@Param("articleId") int id);

       int addArticle(Article article);



}
