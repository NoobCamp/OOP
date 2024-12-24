package org.skypro.skyshop.product;

public class Product {
    private String name;
    private int price;


    @Override
    public String toString() {
        return "Продукт{" +
                "название: " + name + '\'' +
                ", цена: " + price +
                '}';
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {

    }

    public int getPrice() {
        return price;
    }
}
