package com.zf.service;

import com.zf.pojo.Detail;
import org.apache.ibatis.annotations.Param;

public interface DetailService {

    int addDetail(Detail detail);
    int getLastestId();
    int updateDetailByuserId(Detail detail);
    Detail getDetailById(@Param("id") int id);


}
