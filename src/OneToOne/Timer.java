package OneToOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
public class Timer extends Observable{
    private List<Toto> listObservers = new ArrayList<Toto>();
    private int x = 0;
    public Timer(){}
    public void setX(int x){
        this.x = x;
        setChanged();
        notifyObservers();
        notifier();
    }

    public int getX(){
        return x;
    }

    public void addObserver(Toto toto){
        listObservers.add(toto);
    }

    public void deleteObserver(Toto toto){
        listObservers.remove(toto);
    }

    public void notifier(){
        for (Toto lObserver : listObservers) {
            lObserver.update(this, lObserver);
        }
    }
}
