package oop.exercises.ex44;

public class Product {
//This is my product
    //The json will copy info into an object, this class is my blueprint
    //i have the name, price and quantity all listed as needed.
    public String name;
    public double price;
    public int quantity;

    public Product() {
    }

    public Product(String name, double price, int quantity) {
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
