package com.xtd.bs.service.impl;

import com.xtd.bs.entity.Semester;
import com.xtd.bs.mapper.SemesterMapper;
import com.xtd.bs.service.SemesterService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xtd.bs.vo.SemesterVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jnlp.ServiceManager;
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
public class SemesterServiceImpl extends ServiceImpl<SemesterMapper, Semester> implements SemesterService {

    @Autowired
    private SemesterMapper semesterMapper;
    @Override
    public List<Semester> findAllSemester(SemesterVo semesterVo) {
        return semesterMapper.findAllSemester();
    }

    @Override
    public int addSemester(Semester semester) {
        return semesterMapper.addSemester(semester);
    }

    @Override
    public int updateSemester(Semester semester) {
        return semesterMapper.updateSemester(semester);
    }

    @Override
    public int deleteSemester(Integer id) {
        return semesterMapper.deleteSemester(id);
    }
}
