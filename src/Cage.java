public class Cage {

    private boolean isClean;
    private int cageNumber;

    public Cage(boolean isClean, int cageNumber) {
        this.isClean = isClean;
        this.cageNumber = cageNumber;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public int getCageNumber() {
        return cageNumber;
    }

    public void setCageNumber(int cageNumber) {
        this.cageNumber = cageNumber;
    }
}
