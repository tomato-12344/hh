package com.xtd.bs.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 登录账户
     */
    private String username;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 真实名字
     */
    private String realname;

    /**
     * 加密的盐值
     */
    private String salt;

    /**
     * 0为admin 1为 辅导员 2为普通干事
     */
    private Integer identity;


}
