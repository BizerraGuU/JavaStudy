package br.com.exercises.myexercises;

public class Product {

    private String name;
    private double price;

    public void applyDiscount(double discount){

        double aux = price - (price * discount / 100);
        setPrice(aux);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
