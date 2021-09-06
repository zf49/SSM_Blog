package com.zf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {

    private int id;
    private String title;
    private String content;
    private Date dateCreate;
    private int authorId;



}
