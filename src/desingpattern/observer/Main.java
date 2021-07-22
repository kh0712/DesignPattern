package desingpattern.observer;

public class Main {

    public static void main(String[] args) {
        Professor professor = new Professor();
        Student studentA = new Student();
        Student studentB = new Student();

        professor.addObserver(studentA);
        professor.addObserver(studentB);

        professor.notifyObservers(Message.HI);
    }
}
