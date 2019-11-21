public class Guest extends People implements BuyTicket, MakeMess, TakingATour {
    private double wallet;

    public Guest(String name, int age, double wallet) {
        this.wallet = wallet;
        this.setName(name);
        this.setAge(age);
    }

    @Override
    public Ticket buyTicket() {
        Ticket fullTicket = new Ticket();
        return fullTicket;
    }

    @Override
    public String makingMess() {
        return "Zrobiłem rozpierdol.";
    }

    @Override
    public String touring() {
        return "Chodzę sobie i zwiedzam.";
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}
