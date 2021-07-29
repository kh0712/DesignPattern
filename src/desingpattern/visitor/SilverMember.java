package desingpattern.visitor;

public class SilverMember implements Member{
    @Override
    public void getBenefit(Benefit benefit) {
        benefit.getBenefit(this);
    }
}
