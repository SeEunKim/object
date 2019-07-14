package movie;

/**
 * Created by SeEun Kim.
 * Date: 2019-07-15
 * Time: 00:29
 */
public class NoneDefaultDiscountPolicy implements DiscountPolicy {

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
