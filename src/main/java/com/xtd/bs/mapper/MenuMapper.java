package com.xtd.bs.mapper;

import com.xtd.bs.entity.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-27
 */
public interface MenuMapper extends BaseMapper<Menu> {

    List<Menu> findMenuList();
}
