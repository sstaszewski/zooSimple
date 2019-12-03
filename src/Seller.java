public class Seller extends Worker implements WelcomeGuests {


    @Override
    public String welcomingGuests(Guest guest) {
        return "Howdy partner";
    }

    // NAREPEROWAC!
    //    @Override
    public Ticket sellFullPriceTicket(Ticket ticket) {
        return ticket;
        //        return guest.setWallet(guest.getWallet() - ticket.getTicketPrice());
    }

    //    @Override
    public Ticket sellHalfPriceTicket(Ticket ticket) {
        return ticket;
        //        return guest.setWallet(guest.getWallet() - ticket.getTicketPrice()*ticket.addDiscount());
    }

    public Seller(String name, int age, String occupation, double salary) {
        super(name, age, occupation, salary);
    }

}
