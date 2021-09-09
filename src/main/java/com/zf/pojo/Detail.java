package com.zf.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Detail {

    private int id;
    private String fname;
    private String lname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateBirth;
    private String descrip;





}
