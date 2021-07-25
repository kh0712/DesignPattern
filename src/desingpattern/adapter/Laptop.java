package desingpattern.adapter;

public class Laptop implements DigitalPlayer{
    @Override
    public void touchScreen(String name) {
        System.out.println("play on Laptop : "+name);
    }
}
