package org.example;

public class Item {
    private String itemName;
    private double price;
    private double amount;
    private double quantity;

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }


    public Item(){

    }

    public Item(String itemName,double price, double amount, double quantity){
        this.itemName = itemName;
        this.price =price;
        this.amount = amount;
        this.quantity = quantity;
    }
}