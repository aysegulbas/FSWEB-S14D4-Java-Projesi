package com.workintech.product;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public double getSalesPrice(int quantity){
        return quantity*getPrice();
    }
    public abstract void showDetails();

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("********************\n");
        builder.append("Type: " + getType() + "\n");
        builder.append("Price: " + getPrice() + "\n");
        builder.append("Description: " + description + "\n");
        builder.append("Class Type: " + getClass().getSimpleName() + "\n");
        return builder.toString();
    }
}
