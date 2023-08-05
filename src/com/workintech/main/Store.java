package com.workintech.main;

import com.workintech.product.Bread;
import com.workintech.product.Chocolate;
import com.workintech.product.Coke;
import com.workintech.product.ProductForSale;

public class Store {
    public static void main(String[] args) {
ProductForSale[] products=new ProductForSale[5];
products[0]=new Chocolate("Sweets",15,"enfes",15.8);
products[1]=new Bread("Bakery",12,"Taze ekmek","white");
products[3]=new Coke("Drink",10,"soğuk içecek",true);
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
for(ProductForSale product:products){
    if (product != null) {
        product.showDetails();
    }
}
    }
}