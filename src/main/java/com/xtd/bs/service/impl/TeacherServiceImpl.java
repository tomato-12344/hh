package com.xtd.bs.service.impl;

import com.xtd.bs.entity.Teacher;
import com.xtd.bs.mapper.TeacherMapper;
import com.xtd.bs.service.TeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-29
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public List<Teacher> teacherList() {
        return teacherMapper.teacherList();
    }
}
