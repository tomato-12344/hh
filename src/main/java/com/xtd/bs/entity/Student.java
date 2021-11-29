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
import org.springframework.format.annotation.DateTimeFormat;

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
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学生id
     */
    private Integer sid;

    /**
     * 学号
     */
    private String sno;

    /**
     * 学生名字
     */
    private String sname;

    /**
     * 性别
     */
    private Integer ssex;

    /**
     * 生日
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date sbirthday;

    /**
     * 身份证号码
     */
    private String scarid;

    /**
     * 手机号码
     */
    private String sphone;

    /**
     * 父母电话号码
     */
    private String sparentPhone;

    /**
     * 宿舍地址
     */
    private String dormitory;

    /**
     * 班级id
     */
    private Integer lno;

    private String lname;


}
