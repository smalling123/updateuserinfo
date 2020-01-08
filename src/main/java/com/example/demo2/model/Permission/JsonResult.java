package com.example.demo2.model.Permission;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description:
 * @Company:mamaway
 * @Author:smalling
 * @Data:2020/1/2
 * @Time:13:26
 */
@Data
@NoArgsConstructor
public class JsonResult implements Serializable {
    private static final long serialVersionUID = 5180550204697737362L;
    /**状态码*/
    private int code=1;//1表示SUCCESS,0表示ERROR
    /**状态信息*/
    private String message="ok";
    /**正确数据*/
    private Object data;

    public JsonResult(String message){
        this.message=message;
    }
    /**一般查询时调用，封装查询结果*/
    public JsonResult(Object data) {
        this.data=data;
    }
    /**出现异常时时调用*/
    public JsonResult(Throwable t){
        this.code=0;
        this.message=t.getMessage();
    }

}