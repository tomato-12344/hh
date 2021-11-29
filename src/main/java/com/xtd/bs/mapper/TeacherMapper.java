package com.xtd.bs.mapper;

import com.xtd.bs.entity.Teacher;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-29
 */
public interface TeacherMapper extends BaseMapper<Teacher> {

    /**
     * 查询所有辅导员
     * @return
     */
    List<Teacher> teacherList();
}
