package com.nagarro.demo.model;

public class Order {
    private Integer orderId;
    private Integer orderAmount;
    private String orderDate;

    public Order(Integer orderId, Integer orderAmount, String orderDate){
        this.orderId = orderId;
        this.orderAmount = orderAmount;
        this.orderDate = orderDate;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Integer orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
}
