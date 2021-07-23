package desingpattern.factory.concrete.factory;

import desingpattern.factory.Type;
import desingpattern.factory.concrete.compo.LGKeyboard;
import desingpattern.factory.concrete.compo.SamsungKeyboard;
import desingpattern.factory.inter.Keyboard;

public class KeyboardFactory{

    public Keyboard createKeyboard(Type type){
        Keyboard keyboard = null;
        if(type == Type.SAMSUNG){
            keyboard = new SamsungKeyboard();
        }else if(type == Type.LG){
            keyboard = new LGKeyboard();
        }
        return keyboard;
    }
}
