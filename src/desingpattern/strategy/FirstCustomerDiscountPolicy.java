package desingpattern.strategy;

public class FirstCustomerDiscountPolicy implements DiscountPolicy{
    @Override
    public double getDiscountedPrice(Item item) {
        return item.getPrice() * 0.9;
    }
}
