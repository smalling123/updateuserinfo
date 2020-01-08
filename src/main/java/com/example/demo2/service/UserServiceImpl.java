package com.example.demo2.service;

import com.example.demo2.mapper.UserMapper;
import com.example.demo2.model.Permission.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Company:mamaway
 * @Author:smalling
 * @Data:2019/11/18
 * @Time:17:51
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int UpdateAllInfo(UserInfo u) {
        return userMapper.UpdateAllInfo(u);
    }

    @Override
    public int UpdateUserName(String UserName, String OpenId) {
        return userMapper.UpdateUserName(UserName, OpenId);
    }
    @Override
    public int UpdateSex(int Sex, String OpenId) {
        return userMapper.UpdateSex(Sex, OpenId);
    }
    @Override
    public int UpdateBirthday(Date Birthday, String OpenId) {
        return userMapper.UpdateBirthday(Birthday, OpenId);
    }
    @Override
    public int UpdatePhone(String Phone, String OpenId) {
        return userMapper.UpdatePhone(Phone, OpenId);
    }
}
