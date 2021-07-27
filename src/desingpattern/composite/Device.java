package desingpattern.composite;

public interface Device {

    boolean isParent();

    void addDevice(Device device);
    void removeDevice(int idx);
    int getPrice();
    int getPower();
}
