package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Arrays;


public class ProductBasket {
    private Product[] productsElements = new Product[5];
    int currentSize = 0;


    public void addProduct(Product product) {
        if (currentSize < productsElements.length) {
            productsElements[currentSize] = product;
            currentSize++;
        } else {
            throw new IndexOutOfBoundsException("Корзина заполнена");
        }
    }
    public int getTotalCost() {
        int totalCost = 0;
        for (Product product : productsElements) {
            if (product != null) {
                totalCost += product.getPrice();
            }
        }
        return totalCost;
    }

    public boolean findProduct(String productName) {
        for (Product product : productsElements) {
            if (productsElements == null) {
                System.out.println("В корзине нет товаров для сравнения!");
                return false;
            } else if (productName.equalsIgnoreCase(product.getName())) {
                System.out.println("Этот товар есть в корзине");
                return true;
            } else {
                System.out.println("Такого товара нет в корзине");
                return false;
            }
        }
        return true;
    }


    public void printProducts() {
        for (int i = 0; i < currentSize; i++) {
            if (productsElements[i] == null) {
                System.out.println("Корзина пуста");
                break;
            } else {
                System.out.println(productsElements[i]);
            }
        } System.out.println("Сумма стоимости товаров: " + getTotalCost());
    }

    public void clearBasket() {
        System.out.println("Корзина очищена");
        Arrays.fill(productsElements, null);
    }
}

