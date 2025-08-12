package org.example;
import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();

        //Variables
        char grade;
        String message = "";

        //Print grade
        if (marks >= 90 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 80 && marks <= 89) {
            grade = 'B';
        } else if (marks >= 70 && marks <= 79) {
            grade = 'C';
        } else if (marks >= 60 && marks <= 69) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        //Print message
        if (grade =='A' || grade == 'B') {
            message = "Well done";
        } else if (grade == 'C' || grade == 'D') {
            message = "Needs improvement";
        } else {
            message = "Failed";
        }

        //Output
        System.out.println(grade + " : " + message);

        sc.close();
    }
}
