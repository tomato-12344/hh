package com.xtd.bs.service;

import com.xtd.bs.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-27
 */
public interface MenuService extends IService<Menu> {

    /**
     * 查询所有菜单
     * @return
     */
    List<Menu> findMenuList();

}
