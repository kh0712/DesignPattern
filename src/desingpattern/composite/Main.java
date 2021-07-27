package desingpattern.composite;

public class Main {

    public static void main(String[] args) {

        Device computer = new Computer();
        computer.addDevice(new KeyBoard());
        computer.addDevice(new Monitor());

        int power = computer.getPower();
        System.out.println("power = " + power);
        //백만+십만+2만5천 = 1125000

        int price = computer.getPrice();
        System.out.println("price = " + price);
        //300+350+100 = 750

    }
}
