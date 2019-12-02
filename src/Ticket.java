public class Ticket {
    private double ticketPrice;
    private double discount = 0.5;

    public double addDiscount() {
        return discount;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public Ticket(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
