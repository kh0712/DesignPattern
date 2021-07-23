package desingpattern.factory.concrete.factory;

import desingpattern.factory.Type;
import desingpattern.factory.concrete.compo.SamsungComputer;
import desingpattern.factory.inter.Computer;
import desingpattern.factory.inter.ComputerFactory;

public class SamsungFactory implements ComputerFactory {

    private static final Type SAMSUNG = Type.SAMSUNG;
    KeyboardFactory keyboardFactory;
    MouseFactory mouseFactory;

    public SamsungFactory() {
        keyboardFactory = new KeyboardFactory();
        mouseFactory = new MouseFactory();
    }

    @Override
    public Computer createComputer() {
        return new SamsungComputer(keyboardFactory.createKeyboard(SAMSUNG)
                , mouseFactory.createMouse(SAMSUNG));
    }
}
