package com.zf.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Detail {

    private int id;
    private String fname;
    private String lname;
    private Date dateBirth;
    private String descript;






}
