package desingpattern.strategy;

import java.util.List;

public class Calculator {

    private DiscountPolicy discountPolicy;

    public Calculator(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public void setDiscountPolicy(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public double calculateDiscountPrice(List<Item> itemList){
        double sum =0;

        for(Item item : itemList){
            sum += discountPolicy.getDiscountedPrice(item);
        }
        return sum;
    }
}
