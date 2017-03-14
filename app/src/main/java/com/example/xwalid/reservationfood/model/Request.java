package com.example.xwalid.reservationfood.model;

/**
 * Created by xwalid on 11/03/2017.
 */

public class Request {

    private String customerName,chefName;
    private int timeOut,worklfowId;
    private Product product;


    public Request() {
        super();
    }

    public Request(String customerName, String chefName, int worklfowId) {
        this.customerName = customerName;
        this.chefName = chefName;
        this.worklfowId = worklfowId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getChefName() {
        return chefName;
    }

    public void setChefName(String chefName) {
        this.chefName = chefName;
    }

    public int getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    public int getWorklfowId() {
        return worklfowId;
    }

    public void setWorklfowId(int worklfowId) {
        this.worklfowId = worklfowId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Request{" +
                "customerName='" + customerName + '\'' +
                ", chefName='" + chefName + '\'' +
                ", timeOut=" + timeOut +
                ", worklfowId=" + worklfowId +
                '}';
    }
}
