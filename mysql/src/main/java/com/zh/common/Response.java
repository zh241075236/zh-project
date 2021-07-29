package com.zh.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


/**
 * 统一返回对象
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {
    private CodeEnum code;//状态码
    private String message;//消息
    private Object data;//数据

    public static Response result(String msg,Object t){
        if(msg == null){
            return new Response(CodeEnum.SUCCESS,"成功",t);
        }else{
            return new Response(CodeEnum.FAIL, msg, t);
        }
    }
}
