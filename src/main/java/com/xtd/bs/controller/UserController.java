package com.xtd.bs.controller;


import com.alibaba.fastjson.JSON;
import com.xtd.bs.entity.User;
import com.xtd.bs.service.UserService;
import com.xtd.bs.utils.SystemConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-27
 */
@RestController
@RequestMapping("/bs/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(String username, String password, HttpSession session){
        Map<String, Object> map = new HashMap<String, Object>();
        User user = userService.login(username, password);
        //判断对象是否为空，不为空表示登陆成功
        if(user != null){
            //保存当前登录用户
            session.setAttribute(SystemConstant.LOGINUSER,user);
            map.put(SystemConstant.SUCCESS,true);//成功
        }else{
            map.put(SystemConstant.SUCCESS,false);//失败
            map.put(SystemConstant.MESSAGE,"账号密码错误，登录失败");
        }
        //使用Json工具把map集合转换成json类型的数据
        return JSON.toJSONString(map);
    }

}

