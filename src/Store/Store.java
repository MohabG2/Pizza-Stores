package Store;
import Factory.Pizza;
import Observer.Client;

import java.util.ArrayList;

public abstract class Store {
    ArrayList Clients = new  ArrayList<Client>();
    abstract void setState(String state);
    abstract void getState();
    void attach(Client client)
    {
        Clients.add(client);
    }
    void detach(Client client)
    {
        Clients.remove(client);
    }
    void notifyClients()
    {
        for(int i = 0 ;i<Clients.size();i++) {
            Client c = (Client) Clients.get(i);
            c.update();
        }

    }

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    abstract Pizza createPizza(String type);
}
