package desingpattern.decorator;

import desingpattern.decorator.base.RoadDisplay;
import desingpattern.decorator.decorator.DisplayDecorator;
import desingpattern.decorator.decorator.TrafficDisplayDecorator;

public class Main {

    public static void main(String[] args) {
        Display trafficDisplay = new TrafficDisplayDecorator(new RoadDisplay());
        trafficDisplay.draw();
    }
}
