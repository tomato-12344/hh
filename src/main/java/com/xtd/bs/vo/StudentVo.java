package com.xtd.bs.vo;

import com.xtd.bs.entity.Student;

public class StudentVo extends Student {
    //当前页面
    private Integer page;

    //每页显示数量
    private Integer limit;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public StudentVo() {
    }

    public StudentVo(Integer page, Integer limit) {
        this.page = page;
        this.limit = limit;
    }

}
