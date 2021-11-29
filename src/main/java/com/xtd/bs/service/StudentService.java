package com.xtd.bs.service;

import com.xtd.bs.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xtd.bs.vo.StudentVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-27
 */
public interface StudentService extends IService<Student> {

    /**
     * 查询所有学生
     * @param studentVo
     * @return
     */
    List<Student> students(StudentVo studentVo);

    /**
     * 添加学生
     * @param student
     * @return
     */
    int addStudent(Student student);

    /**
     * 修改学生
     * @param student
     * @return
     */
    int updateStudent(Student student);

    /**
     * 删除一个学生
     * @param id
     * @return
     */
    int deleteStudent(int id);
}
