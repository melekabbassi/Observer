import java.util.Observable;
public class Timer extends Observable{
    private int x = 0;
    public Timer(){}
    public void setX(int x){
        this.x = x;
        setChanged();
        notifyObservers();
    }

    public int getX(){
        return x;
    }
}
