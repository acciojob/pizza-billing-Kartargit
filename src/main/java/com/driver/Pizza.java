package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheese;
    private int extraTopping;
    private int takeAway;
    private int totalPrice;
    private  boolean isPaperAdded;
    private boolean isCheese;
    private boolean isTopping;
    private boolean isBillgen;
        public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price = 300;
            extraTopping = 70;
        }
        else{
            price  = 400;
            extraTopping = 120;
        }
        extraCheese = 80;
        takeAway = 20;
        totalPrice += price;
    }
       public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheese){
            totalPrice+=extraCheese;
            isCheese = true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isTopping){
            isTopping = true;
            totalPrice += extraTopping;
        }


    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperAdded){
            totalPrice += takeAway;
            isPaperAdded = true;
        }
    }


    public String getBill(){
        // your code goes here
        if(!isBillgen){
            isBillgen = true;
            bill = "Base Price Of The Pizza: "+getPrice()+"\n";
            if(isCheese) bill = bill+"Extra Cheese Added: "+extraCheese+"\n";
            if(isTopping)bill = bill+"Extra Toppings Added: "+extraTopping+"\n";
            if(isPaperAdded)bill = bill+"Paperbag Added: "+takeAway+"\n";
            bill = bill+"Total Price: "+totalPrice+"\n";
        }

        return this.bill;
    }
}
