package com.xtd.bs.utils;


/**
 * 复杂的项目中经常使用到
 * 这个类的目的是为了防止那些经常被改来改去的数据被改错，
 * 才会定义常量
 */
public class SystemConstant {

    //加密的次数
    public static final Integer PASSWORD_COUNT = 5;

    /**
     * 登录用户保存的key
     */
    public static final String LOGINUSER = "loginUser";

    /**
     * 成功
     */
    public static final String SUCCESS = "success";

    /**
     *验证的提示信息
     */
    public static final String MESSAGE = "message";

    /**
     * 部门是否存在员工
     */
    public static final String EXIST = "exist";


    /**
     * 默认密码
     */
    public static String default_login_pwd="123456";


    /**
     * 图片上传的地址
     */
    public static final String IMAGE_UPLOAD_PATH = "F:/project/hotel/upload/";
}
