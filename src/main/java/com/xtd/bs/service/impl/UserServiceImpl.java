package com.xtd.bs.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xtd.bs.entity.User;
import com.xtd.bs.mapper.UserMapper;
import com.xtd.bs.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xtd.bs.utils.PasswordUtil;
import com.xtd.bs.utils.SystemConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        if (username !=null && username != ""){
            wrapper.eq("username",username);
        }

        User user = userMapper.selectOne(wrapper);
        if (user != null){
            //将密码加密处理
            String newPassword = PasswordUtil.md5(password,user.getSalt(), SystemConstant.PASSWORD_COUNT);

            //比较密码是否一致
            if(user.getPassword().equals(newPassword)){
                return user; //登录成功，
            }
        }
        return null;
    }
}
