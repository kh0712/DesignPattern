package desingpattern.factory.concrete.compo;

import desingpattern.factory.inter.Computer;
import desingpattern.factory.inter.Keyboard;
import desingpattern.factory.inter.Mouse;

public class LGComputer implements Computer {

    public LGComputer(Keyboard keyboard, Mouse mouse) {
    }

    @Override
    public String getName() {
        return "LG";
    }
}
