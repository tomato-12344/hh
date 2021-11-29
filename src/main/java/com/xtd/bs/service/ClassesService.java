package com.xtd.bs.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.xtd.bs.entity.Classes;
import com.xtd.bs.vo.ClassVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-28
 */
public interface ClassesService extends IService<Classes> {

    /**
     * 查询所有班级
     * @return
     */
     List<Classes> findAllClass();

    /**
     * 分页查询所有班级
     * @param classVo
     * @return
     */
    List<Classes> findAllClassByPage(ClassVo classVo);

    int addClasses(Classes classes);

    int updateClasses(Classes classes);

    int deleteClassesById(Integer id);
}
