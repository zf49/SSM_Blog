package com.zf.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    
    private int id;
    private String content;
    private Date dateCreate;
    private int authorId;
    private int articleId;

}
