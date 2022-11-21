package GPS;

import java.util.Observable;

public class GPS extends Observable {
    private String position;
    private int precision;

    public GPS(int position, int precision){
        this.position = "unknown";
        this.precision = 0;
    }

    public void notifierObserver(){

    }


}
