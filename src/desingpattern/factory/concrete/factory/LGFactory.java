package desingpattern.factory.concrete.factory;

import desingpattern.factory.Type;
import desingpattern.factory.concrete.compo.LGComputer;
import desingpattern.factory.inter.Computer;
import desingpattern.factory.inter.ComputerFactory;

public class LGFactory implements ComputerFactory {

    private static final Type LG = Type.LG;
    KeyboardFactory keyboardFactory;
    MouseFactory mouseFactory;

    public LGFactory() {
        keyboardFactory = new KeyboardFactory();
        mouseFactory = new MouseFactory();
    }

    @Override
    public Computer createComputer() {
        return new LGComputer(keyboardFactory.createKeyboard(LG)
                , mouseFactory.createMouse(LG));
    }
}
