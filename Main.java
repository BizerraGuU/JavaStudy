package br.com.exercises.myexercises;

public class Main {

    public static void main(String[] args){

        Product newProduct = new Product();

        newProduct.setName("Notebook");
        newProduct.setPrice(2000.00);

        System.out.println("name: " + newProduct.getName());
        System.out.println("old price: " + newProduct.getPrice());

        newProduct.applyDiscount(10);

        System.out.println("new price: " + newProduct.getPrice());

    }

}
