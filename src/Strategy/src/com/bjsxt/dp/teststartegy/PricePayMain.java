package Strategy.src.com.bjsxt.dp.teststartegy;

/**
 * @author hwp
 * @PACKAGE_NAME: Strategy.src.com.bjsxt.dp.teststartegy
 * @company:小清新
 * @USER:小清新
 * @date: 2021年03月22日 17:12
 * @PROJECT_NAME: test
 **/

public class PricePayMain {
    public static void main(String[] args) {
        MembershipPay mp=new MembershipPay();
        mp.setPrice(100);
        PriceCalculation pc=new IntermediateMembership();
        mp.setPriceCalculation(pc);
        mp.pricePay();
    }
}
