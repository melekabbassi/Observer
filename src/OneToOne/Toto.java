package OneToOne;

import OneToOne.Timer;

import java.util.Observer;

public class Toto implements Observer{
    public String name;
    public Toto(String name){
        this.name = name;
    }
    public void update(java.util.Observable arg0, Object arg){
        System.out.println("I am " + this.name + " the new value is " + ((Timer)arg0).getX());
    }
}
