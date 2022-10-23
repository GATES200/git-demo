package com.itheima.pojo;

/**
 * @ClassName: Product
 * @author: gates
 * @description:
 * @version: 1.0.0
 * @date: 2022/10/21 9:14
 */
public class Product {
    private int id;
    private String goodsname;
    private double price;
    private int typeid;

    public Product(int id, String goodsname, double price, int typeid) {
        this.id = id;
        this.goodsname = goodsname;
        this.price = price;
        this.typeid = typeid;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", goodsname='" + goodsname + '\'' +
                ", price=" + price +
                ", typeid=" + typeid +
                '}';
    }
}
