package com.example.jpademo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "customerorder")
public class CustomerOrder implements Serializable{

    private static final long serialVersionUID = -2285570109923879388L;

    public CustomerOrder() {
        this.lastupdate = new Date();
        this.lineItems = new ArrayList<>();
    }

    public CustomerOrder(Integer orderid, int discount, String shipmentinfo, char status) {
        this.orderid = orderid;
        this.discount = discount;
        this.shipmentinfo = shipmentinfo;
        this.status = status;
        this.lastupdate = new Date();
        this.lineItems = new ArrayList<>();
    }

    @Id
    private Integer orderid;
    private int discount;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdate;
    private String shipmentinfo;
    private char status;
    @OneToMany(mappedBy = "customerOrder", cascade = CascadeType.ALL)
    private Collection<LineItem> lineItems;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getShipmentinfo() {
        return shipmentinfo;
    }

    public void setShipmentinfo(String shipmentinfo) {
        this.shipmentinfo = shipmentinfo;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Collection<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(Collection<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public void addLineItem(LineItem lineItem) {
        this.getLineItems().add(lineItem);
    }

    @Transient
    public int getNextId() {
        return this.lineItems.size() + 1;
    }
}
