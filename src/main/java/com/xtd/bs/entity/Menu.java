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
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 所属父级菜单编号
     */
    private Integer pid;

    /**
     * 菜单名称
     */
    private String title;

    /**
     * 打开链接地址
     */
    private String href;

    /**
     * 是否展开（0-否，1-是）
     */
    private Integer spread;

    /**
     * 打开方式
     */
    private String target;

    /**
     * 菜单图标样式
     */
    private String icon;


}
