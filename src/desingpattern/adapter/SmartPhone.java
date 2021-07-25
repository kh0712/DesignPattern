package desingpattern.adapter;

public class SmartPhone implements DigitalPlayer{
    @Override
    public void touchScreen(String name) {
        System.out.println("play on App : "+name);
    }
}
