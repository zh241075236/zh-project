package com.zh.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zh.annotation.TestAnnotation;
import com.zh.service.IUserService;
import com.zh.common.Response;
import com.zh.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private IUserService userService;

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("test")
    @TestAnnotation("test")
    public void test(){

    }

    @GetMapping("query")
    public Response query(){
        try {
            Page<User> userPage = userService.queryPage(new User("root","root",1));
            Response result = Response.result(null, userPage);
            return result;
        } catch (Exception e){
            e.printStackTrace();
            Response result = Response.result(e.getMessage(), null);
            return result;
        }
    }

}
