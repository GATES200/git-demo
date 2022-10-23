package com.itheima.pojo;

import java.util.List;

/**
 * @ClassName: Category
 * @author: gates
 * @description:
 * @version: 1.0.0
 * @date: 2022/10/21 9:12
 */
public class Category {
    private int id;
    private String typename;

    private List<Product> productList;

    public Category(int id, String typename, List<Product> productList) {
        this.id = id;
        this.typename = typename;
        this.productList = productList;
    }


    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", typename='" + typename + '\'' +
                ", productList=" + productList +
                '}';
    }

    public Category() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
