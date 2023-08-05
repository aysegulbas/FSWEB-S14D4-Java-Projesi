package com.workintech.product;

public class Chocolate extends ProductForSale {
    private double gram;
    public Chocolate(String type, double price, String description,double gram) {
        super(type, price, description);
        this.gram=gram;
    }

    public double getGram() {
        return gram;
    }

    @Override
    public void showDetails() {
        String result=super.toString();
        StringBuilder builder=new StringBuilder();
        builder.append("gram: "+gram+"\n");
        System.out.println(result+builder.toString());
    }


}
