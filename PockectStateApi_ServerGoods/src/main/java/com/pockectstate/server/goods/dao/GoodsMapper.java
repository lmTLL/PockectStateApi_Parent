package com.pockectstate.server.goods.dao;

import com.pockectstate.entity.goods.Goods;
import java.util.List;

public interface GoodsMapper {
    int insert(Goods record);

    int insertSelective(Goods record);

}