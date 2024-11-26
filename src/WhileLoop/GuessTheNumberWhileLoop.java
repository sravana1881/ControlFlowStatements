package WhileLoop;

import java.util.Scanner;

public class GuessTheNumberWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number= (int) (Math.random()*101);
        System.out.println(" guess the magic number between 0 and 100");
        int guess= -3;
        while(guess!=number){
            System.out.println("Please enter the guess numeber");
            guess=input.nextInt();
            if(guess==number){
                System.out.println("You guessed the number is correct : " +number);
            }else if(guess>number){
                System.out.println("You guessed the number is high : " +number);
            }else
                System.out.println("You guessed the number is low : " +number);
            }
        }
    }

