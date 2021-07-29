package com.zh.annotation.processor;

import com.zh.annotation.JedisAnnotation;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class JedisAspect {

    @Pointcut(value = "@annotation(jedisAnnotation)")
    public void pointCut(JedisAnnotation jedisAnnotation){}

    @Before(value = "pointCut(jedisAnnotation)")
    private void before(JedisAnnotation jedisAnnotation){
        
    }
}
