package OneToOne;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Toto toto1 = new Toto("observer1");
        Toto toto2 = new Toto("observer2");
        System.out.println("The initial value is " + timer.getX());
        timer.addObserver(toto1);
        timer.addObserver(toto2);
        timer.setX(10);
        timer.setX(20);
    }
}