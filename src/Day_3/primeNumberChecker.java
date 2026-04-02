package Day_3;

import java.util.Scanner;

public class primeNumberChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        boolean isPrime = true;
        System.out.print("Type n: ");
        n = scanner.nextInt();
        if (n == 2){
            System.out.println("n is prime number");
        } else if (n < 2) {
            isPrime = false;
        } else{

            for (int i = 2; i <= Math.sqrt(n); i++){
                if (n%i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println("n is prime number");
        } else{
            System.out.println("n is not prime number");
        }
        scanner.close();

    }
}
