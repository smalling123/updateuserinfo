package com.example.demo2.mapper;
import com.example.demo2.model.Permission.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
@Repository
public interface UserMapper {
	/**
	 *根据openid更改用户信息
	 * @param u
	 * @return
	 */
	@Update("update userinfo set UserName=#{u.UserName},Sex=#{u.Sex},Birthday=#{u.Birthday},Phone=#{u.Phone} where OpenId=#{u.OpenId}")
	 int UpdateAllInfo(@Param("u") UserInfo u);
    /**
     * 根据openid修改用户姓名
     * @param UserName
     * @param OpenId
     * @return
     */
	@Update("update userinfo set UserName=#{UserName} where OpenId=#{OpenId}")
	int UpdateUserName(@Param("UserName") String UserName, @Param("OpenId") String OpenId);
    /**
     * 根据openid修改用户性别
     * @param Sex
     * @param OpenId
     * @return
     */
	@Update("update userinfo set Sex=#{Sex} where OpenId=#{OpenId}")
	int UpdateSex(@Param("Sex") int Sex, @Param("OpenId") String OpenId);
    /**
     * 根据openid修改生日
     * @param Birthday
     * @param OpenId
     * @return
     */

	@Update("update userinfo set Birthday=#{Birthday} where OpenId=#{OpenId}")
	int UpdateBirthday(@Param("Birthday") java.util.Date Birthday, @Param("OpenId") String OpenId);
    /**
     * 根据openid修改用户手机号
     * @param Phone
     * @param OpenId
     * @return
     */
	@Update("update userinfo set Phone=#{Phone} where openid=#{OpenId}")
	int UpdatePhone(@Param("Phone") String Phone, @Param("OpenId") String OpenId);

}
