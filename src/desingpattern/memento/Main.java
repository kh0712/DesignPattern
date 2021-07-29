package desingpattern.memento;

public class Main {

    public static void main(String[] args) {
        Information info = new Information(1, "A", 1.0);
        CareTaker careTaker = new CareTaker();
        careTaker.save(info.toMemento());

        info.setIntData(2);
        info.setStrData("B");
        careTaker.save(info.toMemento());

        info.setIntData(3);
        info.setStrData("C");
        careTaker.save(info.toMemento());

        System.out.println("Initial Info: "+info.toString());

        info.fromMemento(careTaker.undo());
        System.out.println("First Undo Info: "+info.toString());

        info.fromMemento(careTaker.undo());
        System.out.println("Second Undo Info: "+info.toString());

        info.fromMemento(careTaker.redo());
        System.out.println("Redo Info: "+info.toString());


    }
}
