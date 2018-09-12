package com.example.jpademo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "vendor_part")
public class VendorPart implements Serializable{
    @Id
    private Long vendorpartnumber;

    public Long getVendorpartnumber() {
        return vendorpartnumber;
    }

    public void setVendorpartnumber(Long vendorpartnumber) {
        this.vendorpartnumber = vendorpartnumber;
    }
}
