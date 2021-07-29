package desingpattern.chain;

public class Main {

    public static void main(String[] args) {
        Dispenser thousand = new Dispenser(1000);
        Dispenser hundred = new Dispenser(100);
        Dispenser ten = new Dispenser(10);
        Dispenser one = new Dispenser(1);

        thousand.setNextChain(hundred);
        hundred.setNextChain(ten);
        ten.setNextChain(one);

        thousand.dispense(new Currency(1320));

    }
}
