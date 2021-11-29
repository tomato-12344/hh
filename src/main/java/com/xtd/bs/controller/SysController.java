package com.xtd.bs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SysController {

    /**
     * 去到登录界面
     * @return
     */
    @RequestMapping("/")
    public String toIndex(){
        return "login";
    }

    /**
     * 去到主页面
     * @return
     */
    @GetMapping("/home.html")
    public String toHome(){
        return "home";
    }


//    @GetMapping("/logout")
//    public String logout(HttpSession httpSession){
//        User user = (User) httpSession.getAttribute(SystemConstant.LOGINUSER);
//        httpSession.invalidate();
//        return "login";
//    }

    /**
     * 去到学生管理页面
     * @return
     */
    @RequestMapping("toStudentManager")
    public String toStudentManager(){
        return "admin/student";
    }

    /**
     * 去到桌面
     * @return
     */
    @RequestMapping("desktop")
    public String toDesktop(){
        return "admin/welcome";
    }

    /**
     * 去到专业管理页面
     */
    @RequestMapping("toMajorManager")
    public String toMajorManager(){
        return "admin/majorManager";
    }

    /**
     * 去到班级管理专业
     * @return
     */
    @RequestMapping("toClassManager")
    public String toClassManager(){
        return "admin/classManager";
    }

    /**
     * 去到学籍管理页面
     * @return
     */
    @RequestMapping("toSemesterManager")
    public String toSemesterManager(){
        return "admin/semesterManager";
    }

}
