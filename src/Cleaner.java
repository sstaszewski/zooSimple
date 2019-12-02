public class Cleaner extends Worker implements Cleaning{


    public Cleaner(String name, int age, String occupation, double salary) {
        super(name, age, occupation, salary);
    }

    @Override
    public void cleaning(Cage cage) {
        cage.setIsClean(true);
    }

}
