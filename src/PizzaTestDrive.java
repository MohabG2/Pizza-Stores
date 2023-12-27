import Factory.Pizza;
import Store.Store;
import Store.NYPizzaStore;
public class PizzaTestDrive {
    public static void main(String[] args){
        Store nyStore = new NYPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("You ordered a " + pizza.getName() + "\n");
    }
}