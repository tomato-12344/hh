package com.xtd.bs.controller;


import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xtd.bs.entity.Major;
import com.xtd.bs.entity.Student;
import com.xtd.bs.service.MajorService;
import com.xtd.bs.utils.R;
import com.xtd.bs.utils.SystemConstant;
import com.xtd.bs.vo.MajorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.imageio.ImageReader;
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
@RequestMapping("/bs/major")
public class MajorController {

    @Autowired
    private MajorService majorService;

    @RequestMapping("list")
    public R findAllMajor(MajorVo majorVo){
        System.out.println("majorVo = " + majorVo);
        System.out.println(majorVo);
        System.out.println("==================================>"+majorVo.getPage()+majorVo.getLimit());
        PageHelper.startPage(majorVo.getPage(),majorVo.getLimit());
        List<Major> employeeList = majorService.findAllMajor(majorVo);
        PageInfo<Major> pageInfo = new PageInfo<>(employeeList);
        return new R(pageInfo.getTotal(),pageInfo.getList());
    }



    @PostMapping("addMajor")
    public String addMajor(Major major){
        Map<String, Object> map = new HashMap<String, Object>();
        if (majorService.addMajor(major) > 0){
            map.put(SystemConstant.SUCCESS,true);
            map.put(SystemConstant.MESSAGE,"添加成功");
        }else{
            map.put(SystemConstant.SUCCESS,false);
            map.put(SystemConstant.MESSAGE,"添加失败");
        }
        return JSON.toJSONString(map);
    }

    @PostMapping("updateMajor")
    public String updateMajor(Major major){
        Map<String, Object> map = new HashMap<String, Object>();
        if (majorService.updateMajor(major) > 0){
            map.put(SystemConstant.SUCCESS,true);
            map.put(SystemConstant.MESSAGE,"修改成功");
        }else{
            map.put(SystemConstant.SUCCESS,false);
            map.put(SystemConstant.MESSAGE,"修改失败");
        }
        return JSON.toJSONString(map);
    }

    @PostMapping("deleteMajorById")
    public String deleteMajorById(@RequestParam("id") Integer id){
        Map<String, Object> map = new HashMap<String, Object>();
        if (majorService.deleteMajor(id) > 0){
            map.put(SystemConstant.SUCCESS,true);
            map.put(SystemConstant.MESSAGE,"删除成功");
        }else{
            map.put(SystemConstant.SUCCESS,false);
            map.put(SystemConstant.MESSAGE,"删除失败");
        }
        return JSON.toJSONString(map);
    }



    @RequestMapping("majorList")
    public String majorList(){
        return JSON.toJSONString(majorService.majorList());
    }


}

