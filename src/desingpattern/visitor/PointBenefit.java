package desingpattern.visitor;

public class PointBenefit implements Benefit{
    @Override
    public void getBenefit(GoldMember member) {
        System.out.println("GOLD Member Point Benefit");
    }

    @Override
    public void getBenefit(SilverMember member) {
        System.out.println("Silver Member Point Benefit");

    }
}
