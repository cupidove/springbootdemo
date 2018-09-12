package com.example.jpademo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "lineitem")
public class LineItem implements Serializable{
    private static final long serialVersionUID = 3802355395885395175L;

    @Id
    private int itemid;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "vendorpartnumber")
    private VendorPart vendorPart;
    @Id
    @ManyToOne
    @JoinColumn(name = "orderid", referencedColumnName = "orderid")
    private CustomerOrder customerOrder;

    public LineItem() {
    }

    public LineItem(int quantity, VendorPart vendorPart, CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
        this.itemid = customerOrder.getNextId();
        this.quantity = quantity;
        this.vendorPart = vendorPart;
    }

    public VendorPart getVendorPart() {
        return vendorPart;
    }

    public void setVendorPart(VendorPart vendorPart) {
        this.vendorPart = vendorPart;
    }

    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }


    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
