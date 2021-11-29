package com.xtd.bs.controller;


import com.alibaba.fastjson.JSON;
import com.xtd.bs.service.TeacherService;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-29
 */
@RestController
@RequestMapping("/bs/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("teacherList")
    public String teacherList(){

        return JSON.toJSONString(teacherService.teacherList());
    }


}

