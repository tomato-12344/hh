package com.xtd.bs.controller;


import com.alibaba.fastjson.JSON;
import com.xtd.bs.entity.Menu;
import com.xtd.bs.service.MenuService;
import com.xtd.bs.utils.MenuNode;
import com.xtd.bs.utils.TreeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-27
 */
@RestController
@RequestMapping("/bs/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping("/loadMenuList")
    public String loadMenuList(HttpSession session){
        //创建Map集合，保存MenuInfo菜单信息
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        //创建Map集合，保存homeInfo信息
        Map<String, Object> homeInfo = new LinkedHashMap<String, Object>();
        //创建Map集合，保存logoInfo信息
        Map<String, Object> logoInfo = new LinkedHashMap<String, Object>();

        //调用查询所有菜单列表信息的方法
        List<Menu> menuList = menuService.findMenuList();//该方法无论哪个角色的用户登录，都能够查询所有的功能模块
        //创建集合，保存菜单关系   根据当前用的的角色动态显示菜单列表
        List<MenuNode> menuNodeList = new ArrayList<MenuNode>();
        //循环遍历菜单列表，目的是创建菜单之间层级关系
        //User employee = (User) session.getAttribute(SystemConstant.LOGINUSER);
        //根据当前用户的角色动态显示菜单列表
        //List<Menu> menuList = menuService.findMenuListByEmployeeId(employee.getId());
        //创建集合，保存菜单关系
        //List<MenuNode> menuNodeList = new ArrayList<MenuNode>();
        for (Menu m : menuList) {
            //创建菜单节点对象
            MenuNode menuNode = new MenuNode();
            menuNode.setId(m.getId());//菜单编号
            menuNode.setPid(m.getPid());//父级菜单编号
            menuNode.setHref(m.getHref());//连接地址
            menuNode.setTitle(m.getTitle());//菜单标题
            menuNode.setIcon(m.getIcon());//菜单图标
            menuNode.setTarget(m.getTarget());//打开方式
            menuNode.setSpread(m.getSpread());//是否打开
            //将对象添加到集合
            menuNodeList.add(menuNode);
        }


        //保存HomeInfo信息
        homeInfo.put("title","首页");
        homeInfo.put("href","/desktop");
        //保存logoInfo信息
        logoInfo.put("title","考勤管理系统");//logo标题
        logoInfo.put("image","layui/images/logo.png");//logo图片
        logoInfo.put("href","home.html");//首页地址
        //将菜单信息添加到MenuInfo集合中
        map.put("menuInfo", TreeUtil.toTree(menuNodeList,0));
        map.put("homeInfo",homeInfo);
        map.put("logoInfo",logoInfo);
        //把集合转换为Json字符串
        return  JSON.toJSONString(map);
    }



}

