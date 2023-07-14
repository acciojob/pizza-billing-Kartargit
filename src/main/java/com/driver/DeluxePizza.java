package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        if(isVeg){
            totalPrice = 300;
            extraCheese = 80;
            extraTopping = 70;
        }
        else {
            totalPrice = 400;
            extraCheese = 80;
            extraTopping = 120;
        }
        setPrice(totalPrice);

    }
}
