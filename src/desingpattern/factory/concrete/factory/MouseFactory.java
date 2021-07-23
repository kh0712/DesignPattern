package desingpattern.factory.concrete.factory;

import desingpattern.factory.Type;
import desingpattern.factory.concrete.compo.LGMouse;
import desingpattern.factory.concrete.compo.SamsungMouse;
import desingpattern.factory.inter.Mouse;

public class MouseFactory {

    public Mouse createMouse(Type type){

        Mouse mouse = null;
        if(type == Type.SAMSUNG){
            mouse = new SamsungMouse();
        }else if(type == Type.LG){
            mouse = new LGMouse();
        }
        return mouse;
    }
}
