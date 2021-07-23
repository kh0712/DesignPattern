package desingpattern.factory;

import desingpattern.factory.concrete.SuperFactory;
import desingpattern.factory.inter.Computer;

public class Main {

    public static void main(String[] args) {
        SuperFactory superFactory = new SuperFactory();
        Computer computerA = superFactory.createComputer(Type.SAMSUNG);
        Computer computerB = superFactory.createComputer(Type.LG);

        String nameA = computerA.getName();
        System.out.println("nameA = " + nameA);
        String nameB = computerB.getName();
        System.out.println("nameB = " + nameB);
    }
}
