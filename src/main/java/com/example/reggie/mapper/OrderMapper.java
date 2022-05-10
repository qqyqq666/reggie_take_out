package com.example.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.reggie.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author qqyqq
 * @create 2022-05-10 10:30
 */
@Mapper
public interface OrderMapper extends BaseMapper<Orders> {

}