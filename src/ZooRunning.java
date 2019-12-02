import java.util.Map;
import java.util.TreeMap;

public class ZooRunning {
    public static void main(String[] args) {

        //dodawanie zmiennych coby bylo czym sie bawic
        Cage cage1 = new Cage(true, 13);
        Cleaner cleaner1 = new Cleaner("Kowalski Jan", 34, "Sprzątacz", 2500);
        Guest guest1 = new Guest("Nowak Jan", 35, 400);
        Feeder feeder1 = new Feeder("Dolas Franek", 23, "Dokarmiacz", 2000);
        Seller seller1 = new Seller("asd asdf", 34, "Seller/Welcomer", 2333);
        Ticket ticket = new Ticket(100);
        Animal monkey = new Animal("Monkey", 13, false);

        //sprawdzanie czy sie widza
        cleaner1.cleaning(cage1);
        guest1.makingMess(cage1);
        seller1.welcomingGuests(guest1);
        seller1.sellFullPriceTicket(guest1, ticket);
        seller1.sellHalfPriceTicket(guest1, ticket);
        monkey.isHungry(monkey);
        feeder1.feeding(monkey);
        guest1.touring();

    }
}


//        Map<Integer, Boolean> cagesIsCleanList = new TreeMap<Integer, Boolean>();
//        cagesIsCleanList.put(1,true);
//        cagesIsCleanList.put(2,true);
//        cagesIsCleanList.put(3,false);
//        cagesIsCleanList.put(4,false);
//
//        TreeMap<Integer, Boolean> treeMap = new TreeMap<Integer, Boolean>();
//
//        public static void animalsInCagesFeeding(Map<Integer, Boolean> treeMap){
//            Map<Integer, Boolean> cagesIsWellFed = new TreeMap<Integer, Boolean>();
//            treeMap.put(1, true);
//            treeMap.put(2, false);
//            treeMap.put(3, false);
//            treeMap.put(4, true);
//
//            for (Integer key : cagesIsCleanList.keySet())
//                cagesIsCleanList.get(key);
//        }


//        public void checkDiscount() {
//            if (guest1.getAge() < 18) {
//                seller1.sellHalfPriceTicket();
//            }
//            seller1.sellFullPriceTicket();
//        }