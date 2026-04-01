package Day_2;

import java.util.Scanner;

public class studentGrader {
    public static void main (String[] args){
        double score;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your score: ");
        score = scanner.nextDouble();
        if (score <= 0 || score > 10){
            System.out.println("Score is not variable");
        } else if (score >= 8.5){
            System.out.println("Congratulation, you are excellent student");
        } else if (score < 8.5 && score >= 7.0) {
            System.out.println("You are good student");
        } else if (score < 7.0 && score >= 5.0){
            System.out.println("You are average student");
        } else{
            System.out.println("Sorry, you are bad student");
        }

    }
}
