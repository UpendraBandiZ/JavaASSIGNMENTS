package com.company;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Assignment12 {
    public static void main(String[] args) {
        ArrayList<Student> studentsList=new ArrayList<>();
        studentsList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science",2018, 70.8));
        studentsList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentsList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentsList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentsList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentsList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentsList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentsList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentsList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentsList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentsList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentsList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentsList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentsList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentsList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentsList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentsList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
        System.out.println("All departments in the college");
        studentsList.stream().map(student-> student.engDepartment).distinct().forEach(System.out::println);
        System.out.println("Students names enrolled after 2018:");
        studentsList.stream().filter(student -> student.yearOfEnrollment>2018).map(student -> student.name).forEach(System.out::println);
        System.out.println("Male Students in CSE:");
        studentsList.stream().filter(student -> student.gender.equals("Male")).filter(student -> student.engDepartment.equals("Computer Science")).forEach(System.out::println);
        studentsList.stream().collect(Collectors.groupingBy(Student::getGender)).forEach((s, students) -> System.out.println(s+" Count: "+students.size()));
        System.out.println("Average Age:"+studentsList.stream().collect(Collectors.averagingInt(Student::getAge)));
        System.out.println("Student with max percentage:"+studentsList.stream().max(Comparator.comparingDouble(Student::getPerTillDate)));
        studentsList.stream().collect(Collectors.groupingBy(Student::getEngDepartment)).forEach((s, students) -> System.out.println(s+" Dept Count: "+students.size()));
        studentsList.stream().collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.averagingDouble(Student::getPerTillDate))).forEach((s, aDouble) -> System.out.println(s+" Dept average: "+aDouble));
        System.out.println("Youngest in Electronics:"+studentsList.stream().filter(student -> student.getEngDepartment().equals("Electronic")).collect(Collectors.minBy(Comparator.comparingInt(Student::getAge))));
        studentsList.stream().filter(student -> student.getEngDepartment().equals("Computer Science")).collect(Collectors.groupingBy(Student::getGender)).forEach((s, students) -> System.out.println("Computer Science "+s+" count:"+students.size()));
    }
}