package com.zh.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zh.entity.User;

public interface IUserService extends IService<User> {

    Page<User> queryPage(User user);
}
