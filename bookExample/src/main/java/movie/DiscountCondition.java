package movie;

/**
 * Created by SeEun Kim.
 * Date: 2019-07-14
 * Time: 22:45
 */
public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
