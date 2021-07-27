package desingpattern.template;

public class SecondConcreteClass extends AbstractClass{
    @Override
    protected void hook1() {
        System.out.println("Another Hook1 method");
    }

    @Override
    protected void hook2() {
        System.out.println("Another Hook2 method");
    }
}
