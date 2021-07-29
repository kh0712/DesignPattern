package desingpattern.visitor;

public class DiscountBenefit implements Benefit{
    @Override
    public void getBenefit(GoldMember member) {
        System.out.println("GOLD Member Discount Benefit");
    }

    @Override
    public void getBenefit(SilverMember member) {
        System.out.println("Silver Member Discount Benefit");

    }
}
