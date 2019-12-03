public class Guest extends People implements MakeMess, TakingATour {
    private double wallet;

    public Guest(String name, int age, double wallet) {
        this.wallet = wallet;
        this.setName(name);
        this.setAge(age);
    }

    //do zrobienia
    //    @Override
    public Ticket buyTicket(Seller seller, Ticket ticket) {
        if (getAge() < 18) {
            seller.sellHalfPriceTicket(ticket);
        }
        seller.sellFullPriceTicket(ticket);
        return ticket;
    }

    @Override
    public void makingMess(Cage cage) {
        cage.setIsClean(false);
    }

    @Override
    public String touring() {
        return "Chodzę sobie i zwiedzam.";
    }

    public double getWallet() {
        return wallet;
    }

    public double setWallet(double wallet) {
        return this.wallet = wallet;
    }
}
