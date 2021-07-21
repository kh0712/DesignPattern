package desingpattern.strategy;

public class NotFreshFruitDiscountPolicy implements DiscountPolicy{
    @Override
    public double getDiscountedPrice(Item item) {
        return item.getPrice() * 0.8;
    }
}
