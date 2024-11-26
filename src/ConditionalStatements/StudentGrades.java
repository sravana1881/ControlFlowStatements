package ConditionalStatements;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double marks=0.0;
        String grade;
        System.out.println("Enter the student's marks: ");
        marks = sc.nextDouble();
        if(marks>=90.0 && marks<=100.0){
            grade = "A";
            System.out.println(grade);
        }else if(marks>=80.0 && marks<=89.99){
            grade = "B";
            System.out.println(grade);
        }else if(marks>=70.0 && marks<=79.99){
            grade = "C";
            System.out.println(grade);
        }else if(marks>=60.0 && marks<=69.99){
            grade = "D";
            System.out.println(grade);
        }else if(marks<=59.99){
            grade = "F";
            System.out.println(grade);
        }else if(marks<=0 || marks>100){
            System.out.println("Score out of range");
        }
        sc.close();
    }
}
