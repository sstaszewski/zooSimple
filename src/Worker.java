public class Worker extends People implements Cleaning, FeedingAnimals, SellTickets, WelcomeGuests {
    private String occupation;
    private double salary;


    //do zrobienia
    @Override
    public boolean cleaning() {
        return cage1.setClean = true;
    }

    @Override
    public String feeding() {
        return "Animal is full now.";
    }
// NAREPEROWAC!
    @Override
    public double sellFullPriceTicket() {
        return guest1.setWallet(guest1.getWallet() - fullTicket.getFullTicketPrice());
    }

    @Override
    public double sellHalfPriceTicket() {
        return guest1.setWallet(guest1.getWallet() - fullTicket.addDiscount());
    }

    @Override
    public String welcomingGuests() {
        return "Howdy partner";
    }

    public Worker(String name, int age, String occupation, double salary) {
        this.setName(name);
        this.setAge(age);
        this.occupation = occupation;
        this.salary = salary;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}