package com.example.demo2.service;
import com.example.demo2.model.Permission.UserInfo;
import org.apache.ibatis.annotations.Param;
/**
 * @Description:
 * @Company:mamaway
 * @Author:smalling
 * @Data:2019/11/18
 * @Time:17:44
 */
public interface UserService {

    int  UpdateAllInfo(@Param("u") UserInfo u);

    int UpdateUserName(@Param("UserName") String UserName, @Param("OpenId") String OpenId);

    int UpdateSex(@Param("Sex") int Sex, @Param("openid") String openid);

    int UpdateBirthday(@Param("Birthday") java.util.Date Birthday, @Param("openid") String openid);

    int UpdatePhone(@Param("Phone") String Phone, @Param("openid") String openid);

}
