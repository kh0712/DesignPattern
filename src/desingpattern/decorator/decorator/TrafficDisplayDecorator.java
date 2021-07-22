package desingpattern.decorator.decorator;

import desingpattern.decorator.Display;

public class TrafficDisplayDecorator extends DisplayDecorator{

    public TrafficDisplayDecorator(Display displayDecorator) {
        super(displayDecorator);
    }

    @Override
    public void draw() {
        super.draw();
        trafficDraw();
    }

    private void trafficDraw() {
        System.out.println("Traffic Display");
    }
}
