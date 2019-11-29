public class Ticket {
    private double fullTicketPrice = 100;
    private double discount = 0.5;


    //cos tu nie gra
    public double addDiscount() {
        return fullTicketPrice * discount;
    }


    public double getFullTicketPrice() {
        return fullTicketPrice;
    }
}
