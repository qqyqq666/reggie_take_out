package com.example.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author JlX
 * @create 2022-04-29 19:50
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
