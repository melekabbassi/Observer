package Order;

import java.util.Observable;

public class Order extends Observable {
    private String order;

    public Order(String order){
        this.order = order;
    }
    public Order(){}

    public String getOrder(){
        return this.order;
    }

    public void setOrder(String order){
        this.order = order;
        setChanged();
        notifyObservers(this);
    }

    public void notifierObserver(){
        setChanged();
        notifyObservers(this);
    }
}
