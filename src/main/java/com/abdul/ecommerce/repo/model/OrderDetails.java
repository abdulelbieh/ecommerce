package com.abdul.ecommerce.repo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by abdul on 9/1/17.
 */
@Entity(name = "OrderDetails")
public class OrderDetails {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private double value;

    @JoinColumn(name = "receipt_id")
    @OneToOne(targetEntity = Receipt.class)
    private Receipt receipt;

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }
}
