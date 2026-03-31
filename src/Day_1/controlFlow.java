package Day_1;

import java.util.Scanner;

public class controlFlow {
    public static void main(String[] args){
        double a, b, c;
        Scanner scanner  = new Scanner(System.in);
        System.out.print("a = ");
        a = scanner.nextDouble();
        System.out.print("b = ");
        b = scanner.nextDouble();
        System.out.print("c = ");
        c = scanner.nextDouble();

        double f = a + b + c;
        System.out.println("Sum = " + f);

    }
}
