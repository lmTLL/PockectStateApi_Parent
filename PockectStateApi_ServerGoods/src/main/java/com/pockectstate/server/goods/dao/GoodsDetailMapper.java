package com.pockectstate.server.goods.dao;

import com.pockectstate.entity.goods.GoodsDetail;
import java.util.List;

public interface GoodsDetailMapper {
    int insert(GoodsDetail record);

    int insertSelective(GoodsDetail record);

}