package desingpattern.memento;

import java.util.Stack;

public class CareTaker {

    private Stack<Memento> previous;
    private Stack<Memento> next;

    public CareTaker() {
        this.previous = new Stack<>();
        this.next = new Stack<>();
    }

    public void save(Memento memento){
        previous.push(memento);
        next.setSize(0);
    }
    public Memento undo(){
        next.push(previous.pop());
        return previous.peek();
    }
    public Memento redo(){
        previous.push(next.pop());
        return previous.peek();
    }
}
