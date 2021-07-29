package desingpattern.chain;

public class Dispenser implements DispenseChain{

    private final int DISPENSE_UNIT;

    private DispenseChain next;

    @Override
    public void setNextChain(DispenseChain chain) {
        this.next=chain;
    }

    public Dispenser(int dispenceUnit) {
        this.DISPENSE_UNIT = dispenceUnit;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= DISPENSE_UNIT){
            int num = currency.getAmount() / DISPENSE_UNIT;
            int remainder = currency.getAmount() % DISPENSE_UNIT;

            System.out.println("Dispense " + DISPENSE_UNIT + "Won : "+num);
            if(next != null){
                next.dispense(new Currency(remainder));
            }
        }else{
            if(next != null){
                next.dispense(currency);
            }
        }
    }
}
