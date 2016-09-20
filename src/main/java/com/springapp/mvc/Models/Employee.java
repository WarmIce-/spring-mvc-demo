package com.springapp.mvc.Models;

/**
 * Created by Ishwor on 9/20/2016.
 */
public class Employee {
    private long itemId;
    private String itemName;
    private Double itemPrice;

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
