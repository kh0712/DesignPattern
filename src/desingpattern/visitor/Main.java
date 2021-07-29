package desingpattern.visitor;

public class Main {

    //Member 가 Benefit 을 방문하는게 아닌 -> if/else 로 instance of 확인해야함.
    //오버로딩 사용 불가 (Member 타입으로 넘겨지므로)

    //Benefit 이 Member 를 방문한다.
    //member 내부에서 benefit 객체에 this 넘겨준다.
    //오버로딩 디스패치 가능
    public static void main(String[] args) {
        DiscountBenefit discountBenefit = new DiscountBenefit();
        PointBenefit pointBenefit = new PointBenefit();
        GoldMember goldMember = new GoldMember();
        SilverMember silverMember = new SilverMember();

        goldMember.getBenefit(discountBenefit);
        silverMember.getBenefit(discountBenefit);


        goldMember.getBenefit(pointBenefit);
        silverMember.getBenefit(pointBenefit);
    }
}
