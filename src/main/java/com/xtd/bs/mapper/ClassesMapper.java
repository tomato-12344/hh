package com.xtd.bs.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xtd.bs.entity.Classes;
import com.xtd.bs.vo.ClassVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-28
 */
public interface ClassesMapper extends BaseMapper<Classes> {

    /**
     * 查询所有班级
     * @return
     */
     List<Classes> findAllClass();

    List<Classes> findAllClassByPage(ClassVo classVo);

    int addClasses(Classes classes);

    int updateClasses(Classes classes);

    int deleteClassesById(Integer id);
}
