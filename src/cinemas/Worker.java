package cinemas;

public class Worker extends Person{
    private int monthlySalary;


    public Worker(String fullName, String id, int age, Gender gender) throws InvalidIdLengthException, InvalidIdCharsException {
        super(fullName, id, age, gender);
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Monthly Salary: "+monthlySalary);
    }

}
