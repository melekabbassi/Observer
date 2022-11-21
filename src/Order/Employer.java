package Order;

import java.util.Observable;
import java.util.Observer;

public class Employer implements Observer {

    private String name;

    public Employer(String name){
        this.name = name;
    }

    public Employer(){}

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("The name is " + this.name + " execute the order " + ((Order)arg).getOrder());
    }
}
