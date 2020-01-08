package com.example.demo2.mapper;

import com.example.demo2.model.Permission.UserImg;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @Company:mamaway
 * @Author:smalling
 * @Data:2019/12/30
 * @Time:14:51
 */
@Repository
public interface UserImgMapper {
    @Select("Select img from UserImg where Eid=#{Eid}")
    List<String> selectByEid(@Param("Eid") Integer Eid);


}
