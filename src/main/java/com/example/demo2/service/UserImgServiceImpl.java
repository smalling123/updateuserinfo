package com.example.demo2.service;

import com.example.demo2.mapper.UserImgMapper;
import com.example.demo2.model.Permission.UserImg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Company:mamaway
 * @Author:smalling
 * @Data:2019/12/30
 * @Time:15:15
 */
@Service
public class UserImgServiceImpl implements UserImgService {
    @Autowired
    private UserImgMapper userImgMapper;

    @Override
    public List<String> selectByEid(Integer Eid) {
        return userImgMapper.selectByEid(Eid);
    }
}
