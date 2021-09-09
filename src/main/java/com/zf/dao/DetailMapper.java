package com.zf.dao;

import com.zf.pojo.Detail;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailMapper {

    int addDetail(Detail detail);

    int getLastestId();

    int updateDetailByuserId(Detail detail);

    Detail getDetailById(@Param("id") int id);


}
