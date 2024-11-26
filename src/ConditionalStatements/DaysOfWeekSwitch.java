package ConditionalStatements;

import java.util.Scanner;

public class DaysOfWeekSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of week");
        int day = sc.nextInt();
        if (day < 1 || day > 7) {
            System.out.println("out of range");
        } else {
            switch (day) {
                case 1:
                    System.out.println(day + " Monday");
                    break;
                case 2:
                    System.out.println(day + " Tuesday");
                    break;
                case 3:
                    System.out.println(day + " Wednesday");
                    break;
                case 4:
                    System.out.println(day + " Thursday");
                    break;
                case 5:
                    System.out.println(day + " Friday");
                    break;
                case 6:
                    System.out.println(day + " Saturday");
                    break;
                case 7:
                    System.out.println(day + " Sunday");
                    break;
            }
        }
    }
}
