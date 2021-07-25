package desingpattern.adapter;

public class Main {

    public static void main(String[] args) {

        DigitalPlayer dp = null;

        dp = new AnalogAdapter(new CDPlayer());
        dp.touchScreen("Song in old CD");

        dp = new Laptop();
        dp.touchScreen("New Song");

        dp = new SmartPhone();
        dp.touchScreen("New Song");

        dp = new AnalogAdapter(new DVDPlayer());
        dp.touchScreen("Song in old DVD");

    }
}
