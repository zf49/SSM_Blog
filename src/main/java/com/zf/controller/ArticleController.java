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

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class ArticleController {

    @Qualifier("articleServiceImpl")
    @Autowired
    private ArticleService articleService;



    @RequestMapping("/allArticle")
    public String getAllArticle( Model model) {

        List<Article> allAticle = articleService.getAllArticleContentName();

        for (Article article : allAticle) {
            System.out.println(article);
        }
        
        model.addAttribute("allArticles",allAticle);

        return "allArticle";
    }


    @RequestMapping("/{id}/article")
    public String getArticleByUserId(@PathVariable("id") int userId,Model model)  {
        List<Article> articleByUserId = articleService.getArticleByUserId(userId);
        model.addAttribute("userAllArticles",articleByUserId);
        return "userAllArticle";
    }

    @RequestMapping("/{id}/articleAndComment")
    public String getArticleAndComment(@PathVariable("id") int articleId,Model model)  {
        Article articleByArticleId = articleService.getArticleByArticleId(articleId);
        model.addAttribute(articleByArticleId);
        return "articleComments";
    }



     @RequestMapping("/deleteArticle")
    public String deleteArticle(int id){

        articleService.deleteArticle(id);

        return "redirect:/allArticle";

    }




       @RequestMapping("/toAddArticle")
    public String toaddArticle(){
            return "addArticle";
    }



    //TODO get authorId, Session
     // 拦截器， getSession
    
    @RequestMapping("/addArticle")
    public String addArticle(Article article, HttpSession httpSession,Model model){

        System.out.println(article);
        System.out.println(httpSession.getAttribute("userId"));
        System.out.println(httpSession.getAttribute("userName"));

        Integer userId = (Integer) httpSession.getAttribute("userId");

        System.out.println(userId);
        System.out.println("------");
        article.setAuthorId(userId);
        article.setDateCreate(new Date());
        articleService.addArticle(article);

        System.out.println(article);

        return "redirect:/"+userId+"/article";
    }






}
