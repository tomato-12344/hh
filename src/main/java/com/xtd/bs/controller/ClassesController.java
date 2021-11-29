package com.xtd.bs.controller;


import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xtd.bs.entity.Classes;
import com.xtd.bs.entity.Student;
import com.xtd.bs.service.ClassesService;
import com.xtd.bs.utils.R;
import com.xtd.bs.utils.SystemConstant;
import com.xtd.bs.vo.ClassVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-28
 */
@RestController
@RequestMapping("/bs/classes")
public class ClassesController {
    @Autowired
    private ClassesService classService;

    @RequestMapping("classesList")
    public String findAllClass(){
        return JSON.toJSONString(classService.findAllClass());
    }


    @RequestMapping("classesListByPage")
    public R findAllClassByPage(ClassVo classVo){
        PageHelper.startPage(classVo.getPage(),classVo.getLimit());
        List<Classes> classByPage = classService.findAllClassByPage(classVo);
        PageInfo<Classes> pageInfo = new PageInfo<>(classByPage);
        return new R(pageInfo.getTotal(),pageInfo.getList());
    }

    @PostMapping("addClasses")
    public String addClasses(Classes classes){
        System.out.println("class = " + classes);
        Map<String, Object> map = new HashMap<String, Object>();
        if (classService.addClasses(classes) > 0){
            map.put(SystemConstant.SUCCESS,true);
            map.put(SystemConstant.MESSAGE,"添加成功");
        }else{
            map.put(SystemConstant.SUCCESS,false);
            map.put(SystemConstant.MESSAGE,"添加失败");
        }

        return JSON.toJSONString(map);
    }


    @PostMapping("updateClasses")
    public String updateClasses(Classes classes){
        System.out.println("classes = " + classes);
        Map<String, Object> map = new HashMap<String, Object>();
        if (classService.updateClasses(classes) > 0){
            map.put(SystemConstant.SUCCESS,true);
            map.put(SystemConstant.MESSAGE,"修改成功");
        }else{
            map.put(SystemConstant.SUCCESS,false);
            map.put(SystemConstant.MESSAGE,"修改失败");
        }

        return JSON.toJSONString(map);
    }

    @PostMapping("deleteClassesById")
    public String deleteClassesById(@RequestParam("id") Integer id){
        Map<String, Object> map = new HashMap<String, Object>();
        if (classService.deleteClassesById(id) > 0){
            map.put(SystemConstant.SUCCESS,true);
            map.put(SystemConstant.MESSAGE,"删除成功");
        }else{
            map.put(SystemConstant.SUCCESS,false);
            map.put(SystemConstant.MESSAGE,"删除失败");
        }
        return JSON.toJSONString(map);
    }

}

