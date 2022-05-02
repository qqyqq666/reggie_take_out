package com.example.reggie.dto;

import com.example.reggie.entity.Setmeal;
import com.example.reggie.entity.SetmealDish;
import lombok.Data;

import java.util.List;

/**
 * @author JlX
 * @create 2022-05-02 9:30
 */
@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
