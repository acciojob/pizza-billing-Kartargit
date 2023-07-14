package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    static int extraCheese=0;
    static int extraTopping=0;
    static int takeAway=0;
    static int totalPrice =0;
    static String bills = "";
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        totalPrice = 300;
            setPrice(300);
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        extraCheese = 80;
        totalPrice += 80;

    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg)extraTopping = 70;
        else extraTopping =120;
        totalPrice += extraTopping;

    }

    public void addTakeaway(){
        // your code goes here
        takeAway = 20;
        totalPrice += takeAway;

    }

      static String base = "Base Price Of The Pizza: ";

      static String cheese = "Extra Cheese Added: ";
      static String topping = "Extra Toppings Added: ";
      static String bag = "Paperbag Added: ";
      static String total = "Total Price: ";

    private void setBill(String bills) {
        bills = bills+base+getPrice()+"\n";
       if(extraCheese>0) bills = bills+cheese+extraCheese+"\n";
        if(extraTopping>0)bills = bills+topping+extraTopping+"\n";
        if(takeAway>0)bills = bills+bag+takeAway+"\n";
        this.bill = bills+total+totalPrice+"\n";
    }

    public String getBill(){
        // your code goes here
        setBill(bills);
        return this.bill;
    }
}
