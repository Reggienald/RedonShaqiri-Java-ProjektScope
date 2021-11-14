package com.grit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

    // State
public class RecordCatalogue {
    private final List<Student> studentList;


    //Constructor StudentList.
    public RecordCatalogue() {
        studentList = new ArrayList<>();
    }

    //Returns a list of students.
    public List<Student> getStudentList() {
        return studentList;
    }
        // method to add a student to list.
        public void addStudent(Student student){
            studentList.add(student);
        }

    //Prints all student with its states
    public void printStudents(){
        for(Student s : getStudentList()){
            System.out.println("Name : " + s.getName()
                    + ". Age : " + s.getAge()
                    + ". Grade : " + s.getRecordBook());
        }
    }

        //Searches for a student in studentlist and if found returns the index in list.
        public int findStudent(String name){

            int count = 0;
            for(Student s : studentList){
                if(s.getName().equals(name)){
                    return count;
                }
                count +=1;
            }
            return -1;
        }
        //Uses findstudent() if return is not equal to -1 it will print the student.
        public Student printSpecificStudent(String name){
            Student st = null;
            for( var student : studentList){
                if(student.getName().equals(name)){
                    //st gets the student by name

                    st = studentList.get(studentList.indexOf(student));
                }
            }
            return st;
/*        if(findStudent(name) != -1){
            System.out.println(studentList.get(findStudent(name)));
        }else{
            System.out.println("Cannot find " + name);
        }*/
        }

    //Highest to lowest and printing the highest grade in class
    public void highestGrade(){
        List<Integer> Grades = new ArrayList<>();
        for(Student s : studentList){
            Grades.add(Integer.parseInt(s.getRecordBook().getGrade()));
        }
        Collections.sort(Grades);
        int temp = (Grades.size()-1);
        String gradeToFind = Grades.get(temp).toString();
        for(Student s : studentList){
            if(s.getRecordBook().getGrade().equals(gradeToFind)){
                System.out.println("Highest grade in class is : " +
                        "Name : " + s.getName()
                        + ". Age : " + s.getAge()
                        + ". Grade : " + s.getRecordBook().getGrade());
            }
        }
    }
    //Lowest to highest and printing the lowest grade in class
    public void lowestGrade(){
        List<Integer> Grades = new ArrayList<>();
        for(Student s : studentList){
            Grades.add(Integer.parseInt(s.getRecordBook().getGrade()));
        }
        Collections.sort(Grades);
        int temp = 0;
        String gradeToFind = Grades.get(temp).toString();
        for(Student s : studentList){
            if(s.getRecordBook().getGrade().equals(gradeToFind)){
                System.out.println("Lowest grade in class is : " +
                        "Name : " + s.getName()
                        + ". Age : " + s.getAge()
                        + ". Grade : " + s.getRecordBook().getGrade());
            }
        }
    }
        //Counts the average grade in recordBook and prints.
        public void averageGrades(){
            int size = studentList.size();
            double sum = 0;
            for(Student s : studentList){
                sum += Integer.parseInt(s.getRecordBook().getGrade());
            }
            System.out.println("Average grade is " + sum/size);
        }


        //Reads a text file and creates a students from text file.
        public void fullStudents() throws FileNotFoundException {
            Scanner sc = new Scanner(new File("C:\\Users\\Redon\\IdeaProjects\\ProjectScope\\src\\com\\grit\\Students.txt"));
            while(sc.hasNextLine()){
                String[] s = sc.nextLine().split(" ");
                RecordBook recordBook = new RecordBook(s[0]);
                String name = s[1];
                int age = Integer.parseInt(s[2]);
                Student student = new Student(recordBook, name, age);
            }
            sc.close();
        }


        public Student GetStudent(String name){

        Student st = null;
            for( var student : studentList){
                if(student.getName().equals(name)){
                    //st gets the student by name

                    st = studentList.get(studentList.indexOf(student));
                }
            }
            return st;
        }


    }