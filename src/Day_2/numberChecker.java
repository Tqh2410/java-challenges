package Day_2;

import java.util.Scanner;

public class numberChecker {
    public static void main(String [] args){
        System.out.print("a = ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 0){
            System.out.println("a is even number");
        } else {
            System.out.println("a is not even number");
        }
    }
}
