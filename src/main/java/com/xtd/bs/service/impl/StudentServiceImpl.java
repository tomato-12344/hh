package com.xtd.bs.service.impl;

import com.xtd.bs.entity.Student;
import com.xtd.bs.mapper.StudentMapper;
import com.xtd.bs.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xtd.bs.vo.StudentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-27
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {


    @Autowired
    private StudentMapper studentMapper;

    /**
     * 查询所有学生
     * @return
     */
    @Override
    public List<Student> students(StudentVo studentVo) {
        return studentMapper.students(studentVo);
    }

    /**
     * 添加学生
     * @param student
     * @return
     */
    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    @Override
    public int deleteStudent(int id) {
        return studentMapper.deleteStudent(id);
    }

}
