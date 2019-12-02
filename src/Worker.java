public class Worker extends People{

    private String occupation;
    private double salary;

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