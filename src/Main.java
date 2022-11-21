public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Toto toto = new Toto("observer1");
        System.out.println("The initial value is " + timer.getX());
        timer.addObserver(toto);
        timer.setX(13);
        timer.setX(18);
        timer.setX(15);
    }
}