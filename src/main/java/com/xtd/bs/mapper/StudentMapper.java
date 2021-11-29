package com.xtd.bs.mapper;

import com.xtd.bs.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xtd.bs.vo.StudentVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-27
 */
public interface StudentMapper extends BaseMapper<Student> {

    List<Student> students(StudentVo studentVo);

    int addStudent(Student student);

    int updateStudent(Student student);

    int deleteStudent(int id);
}
