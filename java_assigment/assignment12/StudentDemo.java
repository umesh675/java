package assignment.assignment12;

public class StudentDemo {

    public static void main(String[] args) {

        Student[] students = takeInput();

        StudentFunction studentFunction  = new StudentFunction();

        //1 print all department
        System.out.println("Department list: ");
        System.out.println((studentFunction.allDepartmentList(students)));

        System.out.println("\n");

        //2 Get the names of all students who have enrolled after 2018
        studentFunction.enrollmentStudentList(students,2018);

        //3 details of all male student in the computer sci department
        studentFunction.maleDetailStudentInADepartment(students,"Computer Science");

        //4 count male and female student
        studentFunction.printMaleFemale(students);

        //5 average age of male and female student
        studentFunction.avgAgeOfMaleFemale(students);

        //6 details of highest student having highest percentage
        studentFunction.listAccordingPercentage(students);

        //7 Count the number of students in each department
        studentFunction.studentInEachDepartment(students);

        //8 average percentage achieved in each department
        studentFunction.listOfAvgPercentage(students);

        //9 details of youngest male student in the Electronic department
        System.out.println(studentFunction.youngestStudentDetail(students,"Electronic"));

        //10 male and female students are there in the computer science department
        printNoFemaleMaleInADept(students);
    }


    public static Student[] takeInput(){
        return new Student[]{
                new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8),
                new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2),
                new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3),
                new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80),
                new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70),
                new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70),
                new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70),
                new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80),
                new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85),
                new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82),
                new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83),
                new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4),
                new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6),
                new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8),
                new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4),
                new Student(266, "Sanvi Pandey", 17, "Female", "Electrical", 2019, 72.4),
                new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5),
        };
    }

    public static void printNoFemaleMaleInADept(Student[] students){
        System.out.println("\n\nmale and female students are there in the computer science department");
        System.out.println("Male: "+new StudentFunction().countStudentInADepartment(students,"Male","Computer Science"));
        System.out.println("Female: "+new StudentFunction().countStudentInADepartment(students,"Female","Computer Science"));

    }
}
