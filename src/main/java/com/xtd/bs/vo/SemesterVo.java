package com.xtd.bs.vo;

import com.xtd.bs.entity.Major;
import com.xtd.bs.entity.Semester;


public class SemesterVo extends Semester {
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

    public SemesterVo() {
    }

    public SemesterVo(Integer page, Integer limit) {
        this.page = page;
        this.limit = limit;
    }

}
