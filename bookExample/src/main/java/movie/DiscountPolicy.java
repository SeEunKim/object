package movie;

/**
 * Created by SeEun Kim.
 * Date: 2019-07-15
 * Time: 00:31
 */
public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
