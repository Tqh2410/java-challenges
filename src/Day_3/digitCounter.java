package Day_3;

import java.util.Scanner;

public class digitCounter {
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("Type n > 0: ");
            n = scanner.nextInt();
        }while(n <= 0);
        String N = String.valueOf(n);
        System.out.print("n has " + N.length() + " numbers");
        scanner.close();
    }
}
