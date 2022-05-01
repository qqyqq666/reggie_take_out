package com.example.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author JlX
 * @create 2022-05-01 9:45
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
