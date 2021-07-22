package desingpattern.observer;

public interface Observable {

    // Observer 들에게 메세지를 보낸다.
    void notifyObservers(Message message);

    // Observer를 추가한다.
    void addObserver(Observer observer);

    //Observer 를 삭제한다.
    boolean removeObserver(Observer observer);
}
