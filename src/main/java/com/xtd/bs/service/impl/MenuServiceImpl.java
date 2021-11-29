package com.xtd.bs.service.impl;

import com.xtd.bs.entity.Menu;
import com.xtd.bs.mapper.MenuMapper;
import com.xtd.bs.service.MenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

    @Autowired
    private MenuMapper menuMapper;


    @Override
    public List<Menu> findMenuList() {
        return menuMapper.findMenuList();
    }
}
