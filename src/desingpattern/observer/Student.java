package desingpattern.observer;

public class Student implements Observer{
    @Override
    public void getMessage(Message message) {
        if(message == Message.HI){
            System.out.println("안녕하십니까 교수님!");
        }
    }
}
