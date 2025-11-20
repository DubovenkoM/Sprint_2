import model.*;
import model.constants.Colour;
import service.*;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);

        Food[] food = {meat, redApple, greenApple};

        ShoppingCart cart = new ShoppingCart(food);

        System.out.printf("Сумма товаров без скидки: %.2f руб.\n", cart.getAllPrice());
        System.out.printf("Сумма товаров со скидкой: %.2f руб.\n", cart.getAllPriceDiscount());
        System.out.printf("Сумма всех вегетарианских продуктов без скидки: %.2f руб.\n", cart.getAllVeganPrice());

    }
}
