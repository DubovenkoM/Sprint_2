import model.*;
import model.constants.Colour;
import service.*;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);

        Food[] food = {meat,redApple, greenApple};

        ShoppingCart cart = new ShoppingCart(food);

        System.out.println("Сумма товаров без скидки: " + cart.getAllPrice() + " руб.");
        System.out.println("Сумма товаров со скидкой: " + cart.getAllPriceDiscount() + " руб.");
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getAllVeganPrice() + " руб.");

    }
}
