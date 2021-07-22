package desingpattern.decorator.decorator;

import desingpattern.decorator.Display;

public class DisplayDecorator implements Display {

    private Display displayDecorator;

    public DisplayDecorator(Display displayDecorator) {
        this.displayDecorator = displayDecorator;
    }

    @Override
    public void draw() {
        displayDecorator.draw();
    }
}
