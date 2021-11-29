package com.xtd.bs.service;

import com.xtd.bs.entity.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-29
 */
public interface TeacherService extends IService<Teacher> {

    List<Teacher> teacherList();

}
