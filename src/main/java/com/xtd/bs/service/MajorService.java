package com.xtd.bs.service;

import com.xtd.bs.entity.Major;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xtd.bs.mapper.MajorMapper;
import com.xtd.bs.vo.MajorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-28
 */

public interface MajorService extends IService<Major> {

    List<Major> findAllMajor(MajorVo majorVo);

    int addMajor(Major major);

    int updateMajor(Major major);

    int deleteMajor(Integer id);

    List<Major> majorList();
}
