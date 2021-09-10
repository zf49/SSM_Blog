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

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;


@Controller
public class CommentController {

   private  Article articleByArticleId;
   private  List<Comment> articleComment;
   private int articleId;


    @Autowired
    @Qualifier("commentServiceImpl")
    private CommentService commentService;

    @Autowired
    @Qualifier("articleServiceImpl")
    private ArticleService articleService;

    @RequestMapping("/{id}/getComment")
    public String getArticleComment(@PathVariable("id") int articleId, Model model){
        this.articleId = articleId;
        articleByArticleId = articleService.getArticleByArticleId(articleId);
         articleComment = commentService.getArticleComment(articleId);
        model.addAttribute("comment",articleComment);
        model.addAttribute("article",articleByArticleId);
        return "articleComments";
    }

  @RequestMapping("/toAddComment")
  public String toAddComment(Model model){
      model.addAttribute("article",articleByArticleId);

      return "addComment";
  }

    @RequestMapping("/addComment")
    public String addComment(HttpSession session, Comment comment,Model model){
        Integer userId = (Integer) session.getAttribute("userId");

        comment.setUserId(userId);
        comment.setDateCreate(new Date());

        System.out.println(comment);

        commentService.addComment(comment);

        return "redirect:/"+articleId+"/getComment";
    }



}
