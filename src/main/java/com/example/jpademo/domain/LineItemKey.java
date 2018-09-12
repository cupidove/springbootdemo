package com.example.jpademo.domain;

import java.io.Serializable;

public class LineItemKey implements Serializable{
    private static final long serialVersionUID = -5000879245070806411L;
    private Integer customerOrder;
    private int itemid;

    public LineItemKey() {
    }

    public LineItemKey(Integer order, int itemid) {
        this.setCustomerOrder(order);
        this.setItemid(itemid);
    }

    public Integer getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(Integer customerOrder) {
        this.customerOrder = customerOrder;
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }
}
