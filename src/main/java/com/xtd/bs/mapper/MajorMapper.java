package com.xtd.bs.mapper;

import com.xtd.bs.entity.Major;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xtd.bs.vo.MajorVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-28
 */
public interface MajorMapper extends BaseMapper<Major> {

    List<Major> findAllMajor(MajorVo majorVo);

    int addMajor(Major major);

    int updateMajor(Major major);

    int deleteMajor(Integer id);

    List<Major> majorList();
}
