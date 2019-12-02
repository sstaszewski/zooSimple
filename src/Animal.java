public class Animal implements MakeMess, BeeingHungry{
    private String species;
    private int cageNumber;
    private boolean isHungry;

    @Override
    public void isHungry(Animal animal){
        animal.setHungry(true);
    }

    @Override
    public void makingMess(Cage cage) {
        cage.setIsClean(false);
    }

    public Animal(String species, int cageNumber, boolean isHungry) {
        this.species = species;
        this.cageNumber = cageNumber;
        this.isHungry = isHungry;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getCageNumber() {
        return cageNumber;
    }

    public void setCageNumber(int cageNumber) {
        this.cageNumber = cageNumber;
    }

    public boolean getIsHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }
}
