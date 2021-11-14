package com.grit;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main (String[]args) throws FileNotFoundException {
        runApp();
    }
    public static void runApp() throws FileNotFoundException {
        boolean quit = false;
        RecordCatalogue rc = new RecordCatalogue();
        rc.fullStudents();
        Scanner sc = new Scanner(System.in);

        while (!quit) {
            try {

                System.out.println("""
                        Enter 1 to see all students.
                        Enter 2 for a specific student.
                        Enter 3 for highest grade.
                        Enter 4 for lowest grade.
                        Enter 5 for average grade.
                        Enter 6 to Quit""");
                int x = Integer.parseInt(sc.next());

                switch (x) {
                    case 1 -> rc.printStudents();
                    case 2 -> {
                        System.out.println("Enter name of student");
                        if (sc.hasNext()) {
                            rc.printSpecificStudent(sc.next()).getName();
                        }
                    }
                    case 3 -> rc.highestGrade();
                    case 4 -> rc.lowestGrade();
                    case 5 -> rc.averageGrades();
                    case 6 -> {
                        System.out.println("Quit");
                        quit = true;
                    }
                    default -> System.out.println("You have to enter a number between 1-6");
                }


            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
