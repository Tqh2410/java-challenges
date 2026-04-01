package Day_2;

import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args){
        double a, b;
        char o;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        a = scanner.nextDouble();
        System.out.print("b = ");
        b = scanner.nextDouble();
        System.out.print("Type the operator (+, -, *, /): ");
        o = scanner.next().charAt(0);
        switch (o){
            case '+':
                System.out.print("Result = " + (a + b));
                break;
            case '-':
                System.out.println("Result = " + (a - b));
                break;
            case '*':
                System.out.println("Result = " + (a*b));
                break;
            case '/':
                if (b == 0){
                    System.out.println("Can not divide by 0");

                } else {
                    System.out.println("Result = " + (a/b));

                }
                break;
            default:
                System.out.println("Invalid math operation!");
        }

    }
}
