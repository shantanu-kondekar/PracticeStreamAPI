package com.upgrad.practice.StreamAPI;

//Another Example -- https://github.com/Java-Techie-jt/java8/blob/master/mapVsflatMap/MapVsFlatMap.java
//Another Example -- https://github.com/danvega/filter-by-employees/blob/master/src/main/java/dev/danvega/Application.java

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class StudentsStreamDemo {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Shantanu", "IT", 60000, Arrays.asList("Paid", "Not Paid", "Partially Paid"));
        Student s2 = new Student(2, "Shashank", "ENTC", 50000, Arrays.asList("Paid", "Not Paid", "Partially Paid"));
        Student s3 = new Student(3, "Yogesh", "CIVIL", 70000, Arrays.asList("Paid", "Not Paid", "Partially Paid"));
        Student s4 = new Student(4, "Gaurav", "ENTC", 50000, Arrays.asList("Paid", "Not Paid", "Partially Paid"));
        Student s5 = new Student(5, "Sagar", "IT", 60000, Arrays.asList("Paid", "Not Paid", "Partially Paid"));
        /*Student s6 = new Student(6, "Vilas", "MECH", 90000, "NotPaid");
        Student s7 = new Student(7, "Ketan", "COMP", 55000, "NotPaid");
        Student s8 = new Student(8, "Kunal", "IT", 60000, "NotPaid");
        Student s9 = new Student(9, "Anirudh", "IT", 60000, "NotPaid");
        Student s10 = new Student(10, "Shubham", "IT", 60000, "NotPaid");
        Student s11 = new Student(11, "Shirish", "IT", 60000, "Paid");
        Student s12 = new Student(12, "Abhijeet", "IT", 60000, "Paid");
        Student s13 = new Student(13, "Akhilesh", "IT", 60000, "Paid");
        Student s14 = new Student(14, "Akshay", "Civil", 50000, "Paid");
        Student s15 = new Student(15, "Ajay", "Mech", 50000, "Paid");*/


        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        /*studentList.add(s6);
        studentList.add(s7);
        studentList.add(s8);
        studentList.add(s9);
        studentList.add(s10);
        studentList.add(s11);
        studentList.add(s12);
        studentList.add(s13);
        studentList.add(s14);
        studentList.add(s15);*/


        //Find the list of all students whose dept is IT - Filter

        List<Student> ITStudents = studentList.stream().filter(student -> student.dept.equals("IT")).collect(Collectors.toList());
        System.out.println("List of all IT Students : " + ITStudents.stream().count());
        ITStudents.forEach(student -> {
            System.out.println(student.rollNo + ":" + student.name + ":" +student.paidStatus);

        });
        System.out.println("----------------------------------------------------------------");

        //Print all the paidStatus of the students
        List<List<String>> listOfPaidStatus = studentList.stream().map(student -> student.getPaidStatus()).collect(Collectors.toList());
        System.out.println(listOfPaidStatus);
        //Getting stream of stream data.
        System.out.println("----------------------------------------------------------------");

        List<String> listOfPaidStatusInFlatterFormat = studentList.stream().flatMap(student -> student.getPaidStatus().stream()).collect(Collectors.toList());
        System.out.println(listOfPaidStatusInFlatterFormat);
        //now we will get single stream data
        System.out.println("----------------------------------------------------------------");

        //Find the total fees for all IT Students - Reduce
        int finaFeesforItStudents = ITStudents.stream().reduce(0,(studentFees, fees) -> studentFees + fees.getFees(), Integer::sum);
        System.out.println("Final Fees for all IT Students : " + finaFeesforItStudents);

    }

}

class Student{

    int rollNo;
    String name;
    String dept;
    int fees;
    List<String> paidStatus;

    public Student(int rollNo, String name, String dept, int fees, List<String> paidStatus) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.fees = fees;
        this.paidStatus = paidStatus;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getFees() {
        return fees;
    }

    public List<String> getPaidStatus() {
        return paidStatus;
    }
}
