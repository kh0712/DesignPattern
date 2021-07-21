package desingpattern.strategy;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(new FirstCustomerDiscountPolicy());

        double sum = calculator
                .calculateDiscountPrice(
                        List.of(new Item("apple",1000),new Item("banana",2000)));

        System.out.println(sum);//2700

        return;
    }
}
