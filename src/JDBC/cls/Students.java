package JDBC.cls;

import java.util.Objects;

public class Students {
    private int id;
    private String name;
    private String tel;
    private int avgGrade;
    private String city;
    private boolean isMarried;
    private boolean isRecommnded;

    public Students(int id, String name, String tel, int avgGrade, String city, boolean isMarried) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.avgGrade = avgGrade;
        this.city = city;
        this.isMarried = isMarried;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getAvgGrade() {
        return this.avgGrade;
    }

    public void setAvgGrade(int avgGrade) {
        this.avgGrade = avgGrade;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isMarried() {
        return this.isMarried;
    }

    public void setMarried(boolean married) {
        this.isMarried = married;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Students students = (Students)o;
            return this.id == students.id && this.avgGrade == students.avgGrade && this.isMarried == students.isMarried && Objects.equals(this.name, students.name) && Objects.equals(this.tel, students.tel) && Objects.equals(this.city, students.city);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.name, this.tel, this.avgGrade, this.city, this.isMarried});
    }

    public String toString() {
        return "Students{id=" + this.id + ", name='" + this.name + "', tel='" + this.tel + "', avgGrade=" + this.avgGrade + ", city='" + this.city + "', isMarried=" + this.isMarried + "}\n";
    }
}
