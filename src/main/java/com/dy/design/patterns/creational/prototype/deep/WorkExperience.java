package com.dy.design.patterns.creational.prototype.deep;

import java.io.Serializable;

/**
 * @description 工作经历类，为演示深度拷贝和浅度拷贝而用
 * @author dxy
 * @date 20200306
 */
public class WorkExperience implements Cloneable,Serializable {

    private static final long serialVersionUID = 1L;

    private String workDate;
    private String workCompany;

    public String getWorkDate() {
        return workDate;
    }

    public WorkExperience setWorkDate(String workDate) {
        this.workDate = workDate;

        return this;
    }

    public String getWorkCompany() {
        return workCompany;
    }

    public WorkExperience setWorkCompany(String workCompany) {
        this.workCompany = workCompany;

        return this;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
