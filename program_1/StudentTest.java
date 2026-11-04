package com.studypedia;

import java.util.Scanner;
import java.util.HashSet;

class Student {
    private String usn;
    private String name;
    private static HashSet<String> takenUsns = new HashSet<>();

    public void acceptDetails(Scanner sc) {
        while (true) {
            System.out.println("Enter the USN (Exactly 10 characters): ");
            usn = sc.nextLine();
            if (usn.length() != 10) {
                System.out.println("Invalid! USN must be exactly 10 characters long. Try again");
            } else if (takenUsns.contains(usn)) {
                System.out.println("Invalid! This USN has already been entered. Try again");
            } else {
                takenUsns.add(usn);
                break;
            }
        }

        while (true) {
            System.out.println("Enter Name: ");
            name = sc.nextLine();
            if (name.matches("[a-zA-Z\\s]+")) {
                break;
            } else {
                System.out.println("Invalid! Name must contain only alphabets. Try again.");
            }
        }
    }

    public void displayDetails() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("----------");
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of students: ");
        int n = Integer.parseInt(sc.nextLine());
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("Enter details for student " + (i + 1) + ":");
            students[i].acceptDetails(sc);
        }

        System.out.println("\n== student Details ==");
        for (int i = 0; i < n; i++) {
            System.out.println("student " + (i + 1) + ":");
            students[i].displayDetails();
        }
        sc.close();
    }
}
