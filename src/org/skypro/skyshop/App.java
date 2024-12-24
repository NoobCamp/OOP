package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        Product[] arrayPoduct = new Product[5];
        ProductBasket basket = new ProductBasket();
        Product product1 = new Product("Apple", 123);
        Product product2 = new Product("Banana", 234);
        Product product3 = new Product("Orange", 345);
        Product product4 = new Product("апельсин", 345);
        Product product5 = new Product("мандарин", 345);
        Product product6 = new Product("огурец", 345);
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.addProduct(product4);
        basket.addProduct(product5);
        //basket.addProduct(product6); // это сверх лимита добавлять чтобы
        basket.printProducts();
        System.out.println(basket.getTotalCost());
        basket.findProduct("бананы");
        basket.findProduct("апельсин");
        basket.findProduct("огурец");
        basket.clearBasket();
        basket.printProducts();
    }
}
