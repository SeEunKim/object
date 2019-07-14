package movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by SeEun Kim.
 * Date: 2019-07-14
 * Time: 22:41
 */
public abstract class DefaultDiscountPolicy implements DiscountPolicy{
    private List<DiscountCondition> conditions = new ArrayList<>();
    public DefaultDiscountPolicy(DiscountCondition ... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition each : conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    abstract  protected Money getDiscountAmount(Screening screening);


}
