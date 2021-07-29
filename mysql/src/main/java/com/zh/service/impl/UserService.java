package com.zh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zh.entity.User;
import com.zh.mapper.UserMapper;
import com.zh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public Page<User> queryPage(User user){
        Page<User> userPage = userMapper.selectPage(new Page<>(1, 10), new QueryWrapper<>(user).eq("username", user.getUsername()));
        return userPage;
    }
}
