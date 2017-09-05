package com.jiapengcs.dao;

import com.jiapengcs.bean.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer pkId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer pkId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}