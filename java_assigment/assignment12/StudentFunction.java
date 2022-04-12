package assignment.assignment12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentFunction {

    public List<String> allDepartmentList(Student[] students){

       return Arrays.stream(students)
                .map(Student::getEngDepartment)
                .distinct()
                .sorted()
               .collect(Collectors.toList());

    }

    public void enrollmentStudentList(Student[] students, int year){

        System.out.println("Enrollment Student list in year: "+year);

        Arrays.stream(students)
                .filter(student -> student.getYear_of_enrollment() == year )
                .map(Student::getName)
                .forEach(System.out::println);

    }
    public long countStudentNo(Student[] students, String gender) {

        return Arrays.stream(students)
                .filter(student -> student.getGender().equals(gender))
                .count();
    }

    public int studentAgeSum(Student[] students, String gender){

        return Arrays.stream(students)
                 .filter(student -> student.getGender().equals(gender))
                 .mapToInt(Student::getAge)
                 .sum();
    }


    public void maleDetailStudentInADepartment(Student[] students, String department){

        System.out.println("\n\ndetails of all male student in the "+department+" department");
         Arrays.stream(students)
                .filter(student -> student.getGender().equals("Male"))
                .filter(student -> student.getEngDepartment().equals(department))
                .map(Student::toString)
                .forEach(System.out::println);
    }


    public void printMaleFemale(Student[] students){

        System.out.println("\n\nMale & Female student: ");
        System.out.println("Male Student: "+countStudentNo(students,"Male"));
        System.out.println("Female Student: "+countStudentNo(students,"Female"));

    }

    public void avgAgeOfMaleFemale(Student []students){

        System.out.println("\n\naverage age of male and female student");
        System.out.println("avg age male: "+(studentAgeSum(students,"Male"))/countStudentNo(students,"Male"));
        System.out.println("avg age Female: "+(studentAgeSum(students,"Female"))/countStudentNo(students,"Female"));
    }



    public String youngestStudentDetail(Student[] students , String department){

        System.out.println("\n\ndetails of youngest male student in the "+department+" department");

        return Arrays.stream(students)
                .filter(student -> student.getEngDepartment().equals(department))
                .filter(student -> student.getGender().equals("Male"))
                .min(Comparator.comparingInt(Student::getAge))
                .toString();
    }

    public double sumPercentOfADepartment(Student[] students, String department){
        return Arrays.stream(students)
                .filter(student -> student.getEngDepartment().equals(department))
                .mapToDouble(Student::getPerTillDate)
                .sum();
    }

    public long totalNoOfStudDept(Student[] students, String department){

        return Arrays.stream(students)
                .filter(student -> student.getEngDepartment().equals(department))
                .count();
    }
    public double avgPercentageOfDepartment(Student[] students, String department){

        return ((sumPercentOfADepartment(students,department))/(totalNoOfStudDept(students,department)));
    }

    public void listOfAvgPercentage(Student[] students){

        System.out.println("\n\nList of average percentage student: ");
        List<String> departmentList =  this.allDepartmentList(students);

        for(Object department : departmentList){
            System.out.println(department+":  "+avgPercentageOfDepartment(students,(String) department));
        }

    }

    public void studentInEachDepartment(Student[] students){

        System.out.println("\n\nList of number of student in each department: ");
        List<String> departmentList =  this.allDepartmentList(students);

        for(Object department : departmentList){
            System.out.println(department+":  "+(totalNoOfStudDept(students, (String) department)));
        }
    }

    public void listAccordingPercentage(Student[] students){

        System.out.println("\n\ndetails of highest student having highest percentage: ");
        Arrays.stream(students)
                .sorted(Comparator.comparingDouble(Student::getPerTillDate).reversed())
                .map(Student::toString)
                .forEach(System.out::println);
    }

    public long countStudentInADepartment(Student[] students,String gender, String department){

        return Arrays.stream(students)
                .filter(student -> student.getEngDepartment().equals(department))
                .filter(student -> student.getGender().equals(gender))
                .count();
    }


}
