package theater;

/**
 * Created by SeEun Kim.
 * Date: 2019-07-14
 * Time: 01:17
 */
public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }
}
