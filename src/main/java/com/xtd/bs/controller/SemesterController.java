package com.xtd.bs.controller;


import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xtd.bs.entity.Major;
import com.xtd.bs.entity.Semester;
import com.xtd.bs.service.MajorService;
import com.xtd.bs.service.SemesterService;
import com.xtd.bs.utils.R;
import com.xtd.bs.utils.SystemConstant;
import com.xtd.bs.vo.MajorVo;
import com.xtd.bs.vo.SemesterVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-29
 */
@RestController
@RequestMapping("/bs/semester")
public class SemesterController {


    @Autowired
    private SemesterService semesterService;

    @RequestMapping("list")
    public R findAllMajor(SemesterVo semesterVo){
        System.out.println("semesterVo = " + semesterVo);
        PageHelper.startPage(semesterVo.getPage(),semesterVo.getLimit());
        List<Semester> employeeList = semesterService.findAllSemester(semesterVo);
        PageInfo<Semester> pageInfo = new PageInfo<>(employeeList);
        return new R(pageInfo.getTotal(),pageInfo.getList());
    }



    @PostMapping("addSemester")
    public String addSemester(Semester semester){
        System.out.println("semester = " + semester);
        semester.setGmtCreated(new Date());
        Map<String, Object> map = new HashMap<String, Object>();
        if (semesterService.addSemester(semester) > 0){
            map.put(SystemConstant.SUCCESS,true);
            map.put(SystemConstant.MESSAGE,"添加成功");
        }else{
            map.put(SystemConstant.SUCCESS,false);
            map.put(SystemConstant.MESSAGE,"添加失败");
        }
        return JSON.toJSONString(map);
    }

    @PostMapping("updateSemester")
    public String updateSemester(Semester semester){
        Map<String, Object> map = new HashMap<String, Object>();
        if (semesterService.updateSemester(semester) > 0){
            map.put(SystemConstant.SUCCESS,true);
            map.put(SystemConstant.MESSAGE,"修改成功");
        }else{
            map.put(SystemConstant.SUCCESS,false);
            map.put(SystemConstant.MESSAGE,"修改失败");
        }
        return JSON.toJSONString(map);
    }

    @PostMapping("deleteSemesterById")
    public String deleteMajorById(@RequestParam("id") Integer id){
        Map<String, Object> map = new HashMap<String, Object>();
        if (semesterService.deleteSemester(id) > 0){
            map.put(SystemConstant.SUCCESS,true);
            map.put(SystemConstant.MESSAGE,"删除成功");
        }else{
            map.put(SystemConstant.SUCCESS,false);
            map.put(SystemConstant.MESSAGE,"删除失败");
        }
        return JSON.toJSONString(map);
    }



//    @RequestMapping("majorList")
//    public String majorList(){
//        return JSON.toJSONString(majorService.majorList());
//    }

}

