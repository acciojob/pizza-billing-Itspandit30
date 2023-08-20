package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.price = isVeg ? 300 : 400;
        this.bill = "";
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        if (this.bill.contains("Extra Cheese Added")) {
            return;
        }
        this.price += 80;
        this.bill += "Extra Cheese Added: 80\n";
    }

    public void addExtraToppings() {
        if (this.bill.contains("Extra Toppings Added")) {
            return;
        }
        this.price += (isVeg) ? 70 : 120;
        this.bill += "Extra Toppings Added: " + ((isVeg) ? 70 : 120) + "\n";
    }

    public void addTakeaway() {
        if (this.bill.contains("Paperbag Added")) {
            return;
        }
        this.price += 20;
        this.bill += "Paperbag Added: 20\n";
    }

    public String getBill() {
        this.bill = "Base Price Of The Pizza: " + price + "\n" + this.bill;
        this.bill += "Total Price: " + price;
        return this.bill;
    }
}
