package com.itheima.pojo;

/**
 * @ClassName: IStudent
 * @author: gates
 * @description:
 * @version: 1.0.0
 * @date: 2022/10/21 19:42
 */
public class IStudent {
    private int id;
    private String name;
    private int age;
    private int cid;

    public IStudent(int id, String name, int age, int cid) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.cid = cid;
    }

    public IStudent(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public IStudent() {
    }

    @Override
    public String toString() {
        return "IStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", cid=" + cid +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
}
