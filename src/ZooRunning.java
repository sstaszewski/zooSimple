public class ZooRunning {
    public static void main(String[] args) {

        Cage cage1 = new Cage(true, 13);
        Worker cleaner1 = new Worker("Kowalski Jan", 34, "Sprzątacz", 2500);
        Guest guest1 = new Guest("Nowak Jan", 35, 400);
        Worker feeder1 = new Worker("Dolas Franek", 23, "Dokarmiacz", 2000);
        Worker seller1 = new Worker("asd asdf", 34, "Seller/Welcomer", 2333);
        Ticket fullTicket = new Ticket();
        Ticket halfTicket = new Ticket();
        Animal monkey = new Animal("Monkey", 13);
        monkey.isHungry();
        public boolean feeding2(){
            return monkey.isHungry()=false;
        }

        public void checkDiscount () {
            if (guest1.getAge() < 18) {
                seller1.sellHalfPriceTicket();
            }
            seller1.sellFullPriceTicket();
        }

        cleaner1.cleaning();
        feeder1.feeding();
        guest1.buyTicket();
    }
}
