package com.example.demo2.model.Permission;

import com.example.demo2.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.Serializable;

/**
 * @Description:
 * @Company:mamaway
 * @Author:smalling
 * @Data:2019/12/30
 * @Time:17:07
 */
@Component
public class Result implements Serializable {
    @Autowired
    private DictionaryService dictionaryService;
    private static Result Result;
    @PostConstruct
    public void init(){
        Result=this;
        Result.dictionaryService=this.dictionaryService;
    }
    private int Code = 0;
    public int getCode(){
        return this.Code;
    }
    public void setCode(int value){
        this.Code = value;
    }
    private String Msg = "";
    public String getMsg(){
        return this.Msg;
    }
    public void setMsg(String value){
        this.Msg = value;
    }
    private Object Data = null;
    public Object getData(String sValue){
        return this.Data;
    }
    public void setData(Object value){
        this.Data = value;
    }

}