package desingpattern.facade;

public class BurgerMaker {

    public void makeBurger(){

        BunMaker bunMaker = new BunMaker();
        PattyMaker pattyMaker = new PattyMaker();
        VegeMaker vegeMaker = new VegeMaker();

        bunMaker.makeBun();
        pattyMaker.makePatty();
        vegeMaker.sliceVegetable();

        System.out.println("Making Burger is Done!");
    }
}
