package com.pockectstate.server.goods.dao;

import com.pockectstate.entity.goods.GoodsSpu;
import java.util.List;

public interface GoodsSpuMapper {
    int insert(GoodsSpu record);

    int insertSelective(GoodsSpu record);

}