package com.example.demo2.model.Permission;

import com.example.demo2.service.DictionaryService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.sql.Date;

/**
 * @Description:
 * @Company:mamaway
 * @Author:smalling
 * @Data:2019/12/30
 * @Time:14:44
 */
@Data
public class UserImg {
    private Integer ID;
    private Integer UserID;
    private Integer Eid;
    private String Img;
    private String Type;
    private String Status;
    private Date CreateTime;
}
