package com.suti.community.dao;

import com.suti.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

//注解 专门用于dao和mybatis的bean 就不用repository
@Mapper
public interface UserMapper {
    // 增加增删改查的方法,并加上sql的配置文件

    // 根据id查询用户的方法
    User selectById(int id);

    //根据用户名查询用户的方法
    User selectByName(String username);

    //根据邮箱查询用户的方法
    User selectByEmail(String email);

    //插入用户数据 返回插入的行数
    int insert(User user);

    //修改用户的状态  返回修改的条数
    int updateStatus(int id,int status);

    //修改头像的路径
    int updateHeader(int id,String headerUrl);

    //修改密码
    int updatePassword(int id,String password);
}
