package desingpattern.adapter;

public class DVDPlayer implements AnalogPlayer{
    @Override
    public void insertCD(String name) {
        System.out.println("play DVD : "+name);
    }
}
