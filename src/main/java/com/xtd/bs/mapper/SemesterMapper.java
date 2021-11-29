package com.xtd.bs.mapper;

import com.xtd.bs.entity.Semester;
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
public interface SemesterMapper extends BaseMapper<Semester> {

    List<Semester> findAllSemester();

    int addSemester(Semester semester);

    int updateSemester(Semester semester);

    int deleteSemester(Integer id);

}
