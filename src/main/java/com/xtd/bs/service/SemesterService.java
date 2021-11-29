package com.xtd.bs.service;

import com.xtd.bs.entity.Semester;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xtd.bs.vo.SemesterVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-29
 */
public interface SemesterService extends IService<Semester> {

    List<Semester> findAllSemester(SemesterVo semesterVo);

    int addSemester(Semester semester);

    int updateSemester(Semester semester);

    int deleteSemester(Integer id);
}
