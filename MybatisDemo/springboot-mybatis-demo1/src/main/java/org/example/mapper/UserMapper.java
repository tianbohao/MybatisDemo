package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.pojo.User;

import java.util.List;

@Mapper //应用程序在运行时，会自动为该接口创建一个实现类对象(代理对象) 不需要编写实现类
//并且会自动将该实现类对象注入到spring容器中 IOC容器-->bean对象

public interface UserMapper {

    @Select("select * from user") //查询所有用户
    public List<User> findAll();
}
