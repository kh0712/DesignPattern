package desingpattern.adapter;

public class CDPlayer implements AnalogPlayer{
    @Override
    public void insertCD(String name) {
        System.out.println("play CD : " + name);
    }
}
