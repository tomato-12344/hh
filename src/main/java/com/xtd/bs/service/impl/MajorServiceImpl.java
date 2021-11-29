package com.xtd.bs.service.impl;

import com.xtd.bs.entity.Major;
import com.xtd.bs.mapper.MajorMapper;
import com.xtd.bs.service.MajorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xtd.bs.vo.MajorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 谢腾达
 * @since 2021-11-28
 */
@Service
public class MajorServiceImpl extends ServiceImpl<MajorMapper, Major> implements MajorService {

    @Autowired
    private MajorMapper majorMapper;
    /**
     * 查询所有专业
     * @return
     */
    @Override
    public List<Major> findAllMajor(MajorVo majorVo) {
        return majorMapper.findAllMajor(majorVo);
    }

    @Override
    public int addMajor(Major major) {
        return majorMapper.addMajor(major);
    }

    @Override
    public int updateMajor(Major major) {
        return majorMapper.updateMajor(major);
    }

    @Override
    public int deleteMajor(Integer id) {
        return majorMapper.deleteMajor(id);
    }

    @Override
    public List<Major> majorList() {
        return majorMapper.majorList();
    }
}
