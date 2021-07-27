package desingpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Computer implements Device{

    private List<Device> composites;
    private static final int PRICE = 1000000;
    private static final int POWER = 350;

    public Computer() {
        this.composites = new ArrayList<>();
    }

    @Override
    public boolean isParent() {
        return true;
    }

    @Override
    public void addDevice(Device device) {
        this.composites.add(device);

    }

    @Override
    public void removeDevice(int idx) {
        this.composites.remove(idx);
    }

    @Override
    public int getPrice() {
        return PRICE + composites.stream()
                                    .map(Device::getPrice)
                                    .reduce(0,Integer::sum);
    }

    @Override
    public int getPower() {
        return POWER + composites.stream()
                                .map(Device::getPower)
                                .reduce(0,Integer::sum);
    }
}
