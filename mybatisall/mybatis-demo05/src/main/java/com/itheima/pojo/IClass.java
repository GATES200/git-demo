package com.itheima.pojo;

import java.util.List;

/**
 * @ClassName: IClass
 * @author: gates
 * @description:
 * @version: 1.0.0
 * @date: 2022/10/21 19:41
 */
public class IClass {
    private int id;
    private String classname;
    private  List<IStudent> iStudentList;

    public IClass(int id, String classname, List<IStudent> iStudentList) {
        this.id = id;
        this.classname = classname;
        this.iStudentList = iStudentList;
    }

    @Override
    public String toString() {
        return "IClass{" +
                "id=" + id +
                ", classname='" + classname + '\'' +
                ", iStudentList=" + iStudentList +
                '}';
    }

    public IClass() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public List<IStudent> getiStudentList() {
        return iStudentList;
    }

    public void setiStudentList(List<IStudent> iStudentList) {
        this.iStudentList = iStudentList;
    }
}
