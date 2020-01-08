package com.example.demo2.service;

import com.example.demo2.model.Permission.UserImg;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:
 * @Company:mamaway
 * @Author:smalling
 * @Data:2019/12/30
 * @Time:15:14
 */
public interface UserImgService {
    List<String> selectByEid(@Param("Eid") Integer Eid);
}
