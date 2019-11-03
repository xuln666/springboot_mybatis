package com.xl.mapper;

import com.xl.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    //查询所有用户
    List<User> findAll();

}
