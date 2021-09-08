package com.zf.controller;

import com.zf.pojo.Article;
import com.zf.pojo.Comment;
import com.zf.service.ArticleService;
import com.zf.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class CommentController {

    @Autowired
    @Qualifier("commentServiceImpl")
    private CommentService commentService;

    @Autowired
    @Qualifier("articleServiceImpl")
    private ArticleService articleService;

    @RequestMapping("/{id}/getComment")
    public String getArticleComment(@PathVariable("id") int articleId, Model model){
        Article articleByArticleId = articleService.getArticleByArticleId(articleId);
        List<Comment> articleComment = commentService.getArticleComment(articleId);
        model.addAttribute("comment",articleComment);
        model.addAttribute("article",articleByArticleId);
        return "articleComments";

    }


}
