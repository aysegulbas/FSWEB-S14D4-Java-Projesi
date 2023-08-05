package com.workintech.product;

public class Bread extends ProductForSale {
    private String flourColor;
    public Bread(String type, double price, String description,String flourColor) {
        super(type, price, description);
        this.flourColor=flourColor;
    }

    @Override
    public void showDetails() {
        String result=super.toString();
        StringBuilder builder=new StringBuilder();
        builder.append("Flour: "+flourColor+"\n");
        System.out.println(result+builder.toString());

    }
}
