package desingpattern.decorator.base;

import desingpattern.decorator.Display;

public class RoadDisplay implements Display {

    @Override
    public void draw() {
        System.out.println("Road Display");
    }
}
