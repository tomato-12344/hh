package com.xtd.bs.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
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
 * @since 2021-11-29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Semester implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学期id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 学期名字
     */
    private String name;

    /**
     * 学期备注
     */
    private String remark;

    /**
     * 逻辑删除 1（true） 已删除 0（false）未删除
     */
    private Boolean isDeleted;

    /**
     * 创建时间
     */
    private Date gmtCreated;

    /**
     * 更新时间
     */
    private Date gmtModified;


}
