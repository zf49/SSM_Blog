package com.zf.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.zf.pojo.Article;
import com.zf.service.ArticleService;
import com.zf.utils.GetJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ArticleController {

    @Qualifier("articleServiceImpl")
    @Autowired
    private ArticleService articleService;



    @RequestMapping("/allArticle")
    public String getAllArticle( Model model) {

        List<Article> allAticle = articleService.getAllArticle();

        model.addAttribute("allArticles",allAticle);

        return "allArticle";
    }


    @RequestMapping("/{id}/article")
    public String getArticleByUserId(@PathVariable("id") int userId) throws JsonProcessingException {
        List<Article> articleByUserId = articleService.getArticleByUserId(userId);

        return GetJson.getJson(articleByUserId);

    }








}
