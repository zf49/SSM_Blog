package com.zf.service;


import com.zf.dao.DetailMapper;
import com.zf.pojo.Detail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DetailServiceImpl implements DetailService {

    @Autowired
    private DetailMapper detailMapper;

    public void setDetailMapper(DetailMapper detailMapper) {
        this.detailMapper = detailMapper;
    }

    public int addDetail(Detail detail) {
        return detailMapper.addDetail(detail);
    }

    public int getLastestId() {
        return detailMapper.getLastestId();
    }

    public int updateDetailByuserId(Detail detail) {
        return detailMapper.updateDetailByuserId(detail);
    }

    public Detail getDetailById(int id) {
        return detailMapper.getDetailById(id);
    }


}
