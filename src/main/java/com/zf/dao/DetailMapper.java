package com.zf.dao;

import com.zf.pojo.Detail;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailMapper {

    int addDetail(Detail detail);

    int getLastestId();


}
