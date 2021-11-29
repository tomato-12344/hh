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
 * @since 2021-11-28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Classes implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "lno", type = IdType.AUTO)
    private Integer lno;

    private String lname;

    private Integer majorid;

    private Integer tno;

    /**
     * 专业名字
     */
    private String mname;

    /**
     * 辅导员名字
     */
    private String tname;

    /**
     * 辅导员电话号码
     */
    private String tphone;


}
