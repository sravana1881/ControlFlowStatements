package ConditionalStatements;

import java.util.Scanner;

public class calculateTaxMainMethod {
        public static void main(String[] args) {
            //TaxFiling calculateTax = new TaxFiling();
            Scanner input = new Scanner(System.in);
           // String filingStatus=input.nextLine().trim();
           // Double income=input.nextDouble();
            Scanner scanner = new Scanner(System.in);

            // Get user input for filing status and income
            System.out.println("Enter your filing status (Single, Married Filing Jointly, Married Filing Separately, Head of Household): ");
            String filingStatus = scanner.nextLine().trim();
            System.out.println("Enter your taxable income: " );
            double income = scanner.nextDouble();
            System.out.println(" your income: " + income);

            // Calculate the tax
            double tax = TaxFiling.taxCalculator(filingStatus,income);

            if(tax == -1){
                System.out.println("invalid filing status.Please try with valid status");
            }else{
                System.out.println("Your Income Taxable Amount is: " + tax);
            }
            input.close();
        }
}
