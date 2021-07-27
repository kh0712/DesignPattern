package desingpattern.composite;

public class Monitor implements Device{

    private static final int PRICE = 100000;
    private static final int POWER = 300;


    public Monitor() {
    }

    @Override
    public boolean isParent() {
        return false;
    }

    @Override
    public void addDevice(Device device) {
        return;
    }

    @Override
    public void removeDevice(int idx) {
        return;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }

    @Override
    public int getPower() {
        return POWER;
    }
}
