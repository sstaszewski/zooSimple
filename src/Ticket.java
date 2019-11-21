public class Ticket {
    private double fullTicketPrice = 100;
    private double discount = 0.5;
//    private double halfPriceTicket = fullTicketPrice*discount;

//    public Ticket(double fullTicketPrice){
//        this.fullTicketPrice = fullTicketPrice;
//    }
//
//    public Ticket(double halfPriceTicket, double discount) {
//        this.halfPriceTicket = halfPriceTicket;
//        this.discount = discount;
//        halfPriceTicket = fullTicketPrice*discount;
//    }
//cos tu nie gra
    public double addDiscount() {
        return fullTicketPrice * discount;
    }
//
//    public double getHalfPriceTicket() {
//        return halfPriceTicket;
//    }

    public double getFullTicketPrice() {
        return fullTicketPrice;
    }
}
