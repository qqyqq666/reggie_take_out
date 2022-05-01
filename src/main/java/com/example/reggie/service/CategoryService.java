package com.example.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.reggie.entity.Category;

/**
 * @author JlX
 * @create 2022-04-30 21:04
 */
public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
