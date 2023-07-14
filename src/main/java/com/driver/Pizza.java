package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheese= 80;
    private int extraTopping=0;
    private int takeAway=20;
    private int totalPrice =0;
    private  boolean isPaperAdded = false;
    private boolean isCheese = false;
    private boolean isTopping = false;

    static String bills = "";
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)setPrice(300);
        else setPrice(400);
        totalPrice+=getPrice();
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheese==false){
            totalPrice+=extraCheese;
            isCheese = true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isTopping==false){
            if(getPrice()==300)extraTopping = 70;
            else extraTopping =120;
            isTopping = true;
            totalPrice += extraTopping;
        }


    }

    public void addTakeaway(){
        // your code goes here
        if(isPaperAdded==false){
            totalPrice += takeAway;
            isPaperAdded = true;
        }
    }

      static String base = "Base Price Of The Pizza: ";

      static String cheese = "Extra Cheese Added: ";
      static String topping = "Extra Toppings Added: ";
      static String bag = "Paperbag Added: ";
      static String total = "Total Price: ";

    private void setBill(String bills) {

    }

    public String getBill(){
        // your code goes here
        bill = "Base Price Of The Pizza: "+getPrice()+"\n";
        if(isCheese) bill = bill+"Extra Cheese Added: "+extraCheese+"\n";
        if(isTopping)bill = bill+"Extra Toppings Added: "+extraTopping+"\n";
        if(isPaperAdded)bill = bill+"Paperbag Added: "+takeAway+"\n";
//        totalPrice = totalPrice+extraTopping+extraCheese+takeAway;
        this.bill = bill+"Total Price: "+totalPrice+"\n";
        return this.bill;
    }
}
