package com.xtd.bs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xtd.bs.entity.Classes;
import com.xtd.bs.mapper.ClassesMapper;
import com.xtd.bs.service.ClassesService;
import com.xtd.bs.vo.ClassVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-28
 */
@Service
public class ClassesServiceImpl extends ServiceImpl<ClassesMapper, Classes> implements ClassesService {

    @Autowired
    private ClassesMapper classesMapper;

    /**
     * 查询所有班级
     * @return
     */
    public List<Classes> findAllClass(){
        return classesMapper.findAllClass();
    }

    @Override
    public List<Classes> findAllClassByPage(ClassVo classVo) {
        return classesMapper.findAllClassByPage(classVo);
    }

    @Override
    public int addClasses(Classes classes) {
        return classesMapper.addClasses(classes);
    }

    @Override
    public int updateClasses(Classes classes) {
        return classesMapper.updateClasses(classes);
    }

    @Override
    public int deleteClassesById(Integer id) {
        return classesMapper.deleteClassesById(id);
    }
}
