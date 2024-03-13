package cinemas;

public class Teacher extends Person{
    private String profession;
    private int yearsTeaching;

    public Teacher(String fullName, String id, int age, Gender gender) throws InvalidIdLengthException, InvalidIdCharsException {
        super(fullName, id, age, gender);
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Profession: "+profession);
        System.out.println("Teaching "+yearsTeaching+" years");
    }
}
