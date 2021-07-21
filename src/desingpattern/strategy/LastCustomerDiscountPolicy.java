package desingpattern.strategy;

public class LastCustomerDiscountPolicy implements DiscountPolicy{
    @Override
    public double getDiscountedPrice(Item item) {
        return item.getPrice() * 0.7;
    }
}
