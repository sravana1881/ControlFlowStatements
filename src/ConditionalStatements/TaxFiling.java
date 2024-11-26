package ConditionalStatements;

import java.util.Scanner;

public class TaxFiling {
    public static double taxCalculator(String filingStatus, double income) {

        //Scanner sc = new Scanner(System.in);
        // filingStatus = sc.nextLine();
        //double taxableIncome = sc.nextDouble();
        Double taxableIncome = 0.00;


        if (filingStatus.equalsIgnoreCase( "Single")) {

            if (income > 0 && income <= 8350.99) {
                taxableIncome = income * .10;
            } else if (income >= 8351 && income <= 33950.99) {
                taxableIncome = income * .15;
            } else if (income >= 33951 && income <= 82250.99) {
                taxableIncome = income * .25;
            } else if (income >= 82251 && income <= 171550.99) {
                taxableIncome = income * .28;
            } else if (income >= 171551 && income <= 372950.99) {
                taxableIncome = income * .33;
            } else if (income >= 372951) {
                taxableIncome = income * .35;
            }
        }
        else if ((filingStatus.equalsIgnoreCase("Married filing jointly")) ||
                (filingStatus.equalsIgnoreCase("Qualifying Widow(er)"))) {

            if (income > 0 && income <= 16700.99) {
                taxableIncome = income * .10;
            } else if (income >= 16701 && income <= 67900.99) {
                taxableIncome = income * .15;
            } else if (income >= 67901 && income <= 137050.99) {
                taxableIncome = income * .25;
            } else if (income >= 137051 && income <= 208850.99) {
                taxableIncome = income * .28;
            } else if (income >= 208851 && income <= 372950.99) {
                taxableIncome = income * .33;
            } else if (income >= 372951) {
                taxableIncome = income * .35;
            }
        }
        else if (filingStatus.equalsIgnoreCase("Married filing separately")) {

            if (income > 0 && income <= 8350.99) {
                taxableIncome = income * .10;
            } else if (income >= 8351 && income <= 33950.99) {
                taxableIncome = income * .15;
            } else if (income >= 33951 && income <= 68625.99) {
                taxableIncome = income * .25;
            } else if (income >= 68526 && income <= 104425.99) {
                taxableIncome = income * .28;
            } else if (income >= 104426 && income <= 186475.99) {
                taxableIncome = income * .33;
            } else if (income >= 186476) {
                taxableIncome = income * .35;
            }
        }
        else if (filingStatus.equalsIgnoreCase ("Head of Household")) {

            if (income > 0 && income <= 11950.99) {
                taxableIncome = income * .10;
            } else if (income >= 11951 && income <= 45500.99) {
                taxableIncome = income * .15;
            } else if (income >= 45501 && income <= 117450.99) {
                taxableIncome = income * .25;
            } else if (income >= 117451 && income <= 190200.99) {
                taxableIncome = income * .28;
            } else if (income >= 1902011 && income <= 372950.99) {
                taxableIncome = income * .33;
            } else if (income >= 372951) {
                taxableIncome = income * .35;
            }
        } else {
            return -1;
        }
        return taxableIncome;
    }
}
