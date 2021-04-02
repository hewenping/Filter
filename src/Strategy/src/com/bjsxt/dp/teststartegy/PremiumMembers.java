package Strategy.src.com.bjsxt.dp.teststartegy;

/**
 * @author hwp
 * @PACKAGE_NAME: Strategy.src.com.bjsxt.dp.teststartegy
 * @company:小清新
 * @USER:小清新
 * @date: 2021年03月22日 17:03
 * @PROJECT_NAME: test
 **/

public class PremiumMembers implements PriceCalculation{
    @Override
    public Double doPrice(int perice) {
        System.out.println("这是高级会员");
        return perice*0.8;
    }
}
