package theater;

/**
 * Created by SeEun Kim.
 * Date: 2019-07-14
 * Time: 01:10
 */
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
