package desingpattern.composite;

public class KeyBoard implements Device{

    private static final int PRICE = 25000;
    private static final int POWER = 100;


    public KeyBoard() {
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
