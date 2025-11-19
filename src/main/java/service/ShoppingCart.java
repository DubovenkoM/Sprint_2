package service;

import model.*;

public class ShoppingCart {
    private Food[] food;

    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    //получить общую сумму товаров в корзине без скидки
    public double getAllPrice() {
        double result = 0;
        for (Food foods : food) {
            result = result + foods.getAmount() * foods.getPrice();
        }
        return result;
    }

    //получить общую сумму товаров в корзине со скидкой
    public double getAllPriceDiscount() {
        double result = 0;
        for (Food foods : food) {
            double price = foods.getAmount() * foods.getPrice();
            double discount = foods.getDiscount();
            price = price * (1 - discount / 100);
            result = result + price;
        }
        return result;
    }

    //получить общую сумму всех вегетарианских продуктов в корзине без скидки
    public double getAllVeganPrice() {
        double result = 0;
        for (Food foods : food) {
            if (foods.isVegetarian()) {
                result = result + foods.getAmount() * foods.getPrice();
            }
        }
        return result;
    }
}

