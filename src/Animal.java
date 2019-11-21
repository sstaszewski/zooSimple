public class Animal {
    private String species;
    private int cageNumber;

    public boolean isHungry(){
        return true;
    }

    public Animal(String species, int cageNumber) {
        this.species = species;
        this.cageNumber = cageNumber;
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
}
