package Observer;

import Store.Store;

public abstract class Client {
    Store store;
    public abstract void update();
}
