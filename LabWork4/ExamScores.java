package LabWork4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExamScores {
    public static void main(String[] args){
        int totalExamScores = 0;
        Scanner in = new Scanner(System.in);
        final DecimalFormat ONEDECIMALPLACE = new DecimalFormat("00.#");
        do {
            System.out.print("How many exam scores there are? ");
            totalExamScores = in.nextInt();
            if (totalExamScores > 0){
                break;
            }
            else{
                totalExamScores = 0;
                System.out.println("The value given is incorrect! Try again.");
                continue;
            }
        }while (true);
        double [] examScores = new double[totalExamScores];
        for ( int i = 0; i < totalExamScores; i++){
            System.out.print("Enter score #" + (i+1) + " ");
            examScores[i] = in.nextDouble();
            if (examScores[i] >= 0 && examScores[i]<=100){
                continue;
            }else {
                examScores[i] = 0;
            }
        }
        System.out.println("The average score is: " + ONEDECIMALPLACE.format(calculateTheAverage(examScores)));
        System.out.println("There are " + calculateGreaterThanAverage(calculateTheAverage(examScores) , examScores)+ " scores larger than the average");
    }

    public static double calculateTheAverage(double[] scores){
        double sumOftheScores = 0;
        for (double score : scores) {
            sumOftheScores += score;
        }
        return  sumOftheScores/scores.length;
    }
    public static int calculateGreaterThanAverage(double average, double[] scores){
        int countGreaterThanAverage = 0;
        for ( int i = 0; i < scores.length; i++){
            if (scores[i] > average){
                countGreaterThanAverage++;
            }
        }
        return countGreaterThanAverage;
    }
}