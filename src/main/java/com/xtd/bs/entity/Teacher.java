package com.xtd.bs.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
 * @since 2021-11-29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 辅导员工号
     */
    @TableId(value = "tno", type = IdType.AUTO)
    private Integer tno;

    /**
     * 辅导员名字
     */
    private String tname;

    /**
     * 辅导员性别
     */
    private Integer tsex;

    /**
     * 辅导员电话
     */
    private String tphone;

    /**
     * 辅导员出生日期
     */
    private Date tbirthday;

    /**
     * 级别
     */
    private String prof;

    /**
     * 部门id
     */
    @TableField("departId")
    private Integer departId;


}
