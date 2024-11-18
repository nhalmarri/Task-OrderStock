package com.example.order.bo;

public class OrderResponse {

    private String item;

    private int remainingQty;

    private String status;

    private long orderId;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getRemainingQty() {
        return remainingQty;
    }

    public void setRemainingQty(int remainingQty) {
        this.remainingQty = remainingQty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "OrderResponse{" +
                "item='" + item + '\'' +
                ", remainingQty=" + remainingQty +
                ", status='" + status + '\'' +
                ", orderId=" + orderId +
                '}';
    }




}
