package cinemas;

public class Student extends Person{
    private String school,profession;

    public Student(String fullName, String id, int age, Gender gender) throws InvalidIdLengthException, InvalidIdCharsException {
        super(fullName, id, age, gender);
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("School: "+school);
        System.out.println("Profession: "+profession);

    }
}
