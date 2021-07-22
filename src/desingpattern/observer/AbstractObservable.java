package desingpattern.observer;

import java.util.Vector;

public abstract class AbstractObservable implements Observable{

    private Vector<Observer> observers;

    public AbstractObservable(){
        observers = new Vector<>();
    }


    @Override
    public void notifyObservers(Message message) {
        observers.forEach(observer -> observer.getMessage(message));
    }

    @Override
    public void addObserver(Observer observer) {
        if(!observers.contains(observer)){
            observers.add(observer);
        }
    }

    @Override
    public boolean removeObserver(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
            return true;
        }
        return false;
    }
}
