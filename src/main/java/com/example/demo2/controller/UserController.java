package com.example.demo2.controller;
import com.example.demo2.model.Permission.UserImg;
import com.example.demo2.model.Permission.UserInfo;
import com.example.demo2.service.UserImgService;
import com.example.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @Description:
 * @Company:mamaway
 * @Author:smalling
 * @Data:2019/11/18
 * @Time:18:23
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserImgService userImgService;
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/updateUserName", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> updateUserName(String UserName, String OpenId) {
        Map<String, String> map = new HashMap<>();
        int num = userService.UpdateUserName(UserName, OpenId);
        if (num > 0) {
            map.put("msg", "修改成功");
            map.put("code", "200");
        } else {
            map.put("msg", "修改失败");
        }
        return map;
    }
    @RequestMapping(value = "/updatePhone", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> updatePhone(String Phone, String OpenId) {
        Map<String, String> map = new HashMap<>();
        int num = userService.UpdatePhone(Phone, OpenId);
        if (num > 0) {
            map.put("msg", "修改成功");
            map.put("code", "200");
        } else {
            map.put("msg", "修改失败");
        }
        return map;
    }
    @RequestMapping(value = "/updateSex", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> updateSex(Integer Sex, String OpenId) {
        Map<String, String> map = new HashMap<>();
        int num = userService.UpdateSex(Sex, OpenId);
        if (num > 0) {
            map.put("msg", "修改成功");
            map.put("code", "200");
        } else {
            map.put("msg", "修改失败");
        }
        return map;
    }
    @RequestMapping(value = "/updateBirthday", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> updateBirthday(java.util.Date Birthday, String OpenId) {
        Map<String, String> map = new HashMap<>();
        int num = userService.UpdateBirthday(Birthday, OpenId);
        if (num > 0) {
            map.put("msg", "修改成功");
            map.put("code", "200");
        } else {
            map.put("msg", "修改失败");
        }
        return map;
    }
    @RequestMapping(value = "/saveUpdateAllInfo", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> saveUpdateAllInfo(@RequestBody UserInfo userInfo) {
        String Sex=String.valueOf(userInfo.getSex());
        System.out.println(Sex);
        if(("1").equals(Sex)){
            userInfo.setSex(1);
        }else {
            userInfo.setSex(0);
        }
        System.out.println(Sex);
        Map<String, String> map = new HashMap<>();
        int num = userService.UpdateAllInfo(userInfo);
        if (num > 0) {
            map.put("msg", "修改成功");
            map.put("code", "200");
        } else {
            map.put("msg", "修改失败");
        }
        return map;
    }
    @GetMapping("/updateAllInfo")
    public String updateAllInfo(){
        return "updateUserInfo";
    }
    @GetMapping("/uinfo")
    public UserInfo userInfo(){
        UserInfo userInfo =new UserInfo();
        userInfo.setSex(1);
        return userInfo;
    }
   /* @RequestMapping(value = "/byEid", method = RequestMethod.POST)
    @ResponseBody
    public Result selectByEid(Integer Eid){
        Result result =new Result();
        try {
            result.setData(userImgService.selectByEid(Eid));
        }catch (Exception error){
            result.setCode(error.hashCode());
            result.setMsg(error.getMessage());
            return result;
        }
        return result;
    }*/
    @RequestMapping(value = "/getbyEid", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> selectByEid(Integer Eid){
        Map<String,Object> map = new HashMap<>();
        List<String> img=userImgService.selectByEid(Eid);
            if(img==null && img.isEmpty()) {
                map.put("msg", "暂无数据");
                System.out.println("如果为空"+map);
            }else {
                map.put("data", userImgService.selectByEid(Eid));
                map.put("code","200");
                System.out.println("如果不为空"+map);
            }
        return map;
    }
}