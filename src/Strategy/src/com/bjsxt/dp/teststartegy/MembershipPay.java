package Strategy.src.com.bjsxt.dp.teststartegy;

import lombok.Data;

/**
 * @author hwp
 * @PACKAGE_NAME: Strategy.src.com.bjsxt.dp.teststartegy
 * @company:小清新
 * @USER:小清新
 * @date: 2021年03月22日 17:09
 * @PROJECT_NAME: test
 **/
@Data
public class MembershipPay {
    /**
     * 价格
     * */
    private Integer price;

    PriceCalculation priceCalculation;

    public void pricePay(){
        System.out.println("实际要付价格： "+priceCalculation.doPrice(price));
    }
}
