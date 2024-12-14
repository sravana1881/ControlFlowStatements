package LoopsPracticeAssignment;

import java.util.Scanner;

public class PredictTutionFee {
    public static void main(String[] args) {
        int tutionfee = 10000;
        int year = 0;
        double futuretution=10000;
        System.out.println(year+ "\t" +tutionfee);
        while (futuretution <= 2 * tutionfee) {
              year++;
              futuretution = (futuretution*.07) + futuretution;
              System.out.println(year+ "\t" +futuretution);
        }
    }
}
