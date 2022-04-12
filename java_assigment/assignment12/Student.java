package assignment.assignment12;

public class Student {

    private int fieldId;
    private String name;
    private int age;
    private String gender;
    private String engDepartment;
    private int year_of_enrollment;
    private double perTillDate;

    public Student(int fieldId, String name, int age, String gender, String engDepartment, int year_of_enrollment, double perTillDate) {
        this.fieldId = fieldId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.year_of_enrollment = year_of_enrollment;
        this.perTillDate = perTillDate;
    }

    public int getFieldId() {
        return fieldId;
    }

    public void setFieldId(int fieldId) {
        this.fieldId = fieldId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEngDepartment() {
        return engDepartment;
    }

    public void setEngDepartment(String engDepartment) {
        this.engDepartment = engDepartment;
    }

    public int getYear_of_enrollment() {
        return year_of_enrollment;
    }

    public void setYear_of_enrollment(int year_of_enrollment) {
        this.year_of_enrollment = year_of_enrollment;
    }

    public double getPerTillDate() {
        return perTillDate;
    }

    public void setPerTillDate(double perTillDate) {
        this.perTillDate = perTillDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fieldId=" + fieldId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", engDepartment='" + engDepartment + '\'' +
                ", year_of_enrollment=" + year_of_enrollment +
                ", perTillDate=" + perTillDate +
                '}';
    }
}
