public class Feeder extends Worker implements FeedingAnimals {
    public Feeder(String name, int age, String occupation, double salary) {
        super(name, age, occupation, salary);
    }
    @Override
    public String feeding(Animal animal) {
        return "Animal is full now.";
    }

}
