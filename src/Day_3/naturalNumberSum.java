package Day_3;

import java.util.Scanner;

public class naturalNumberSum {
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type n > 0: ");
        n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++){
            sum += i;
        }
        System.out.print("Sum = " + sum);
        scanner.close();
    }

}
