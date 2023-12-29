package Store;

import Factory.*;

public class NYPizzaStore extends Store{
    @Override
    void setState(String state) {

    }

    @Override
    void getState() {

    }

    @Override
    Pizza createPizza(String item){
        return switch (item) {
            case "cheese" -> new NYStyleCheesePizza();
            case "pepperoni" -> new NYStylePepperoniPizza();
            case "clam" -> new NYStyleClamPizza();
            case "veggie" -> new NYStyleVeggiePizza();
            default -> null;
        };
    }
}
