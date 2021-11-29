package com.xtd.bs.service;

import com.xtd.bs.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-27
 */
public interface UserService extends IService<User> {

    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    User login(String username, String password);
}
