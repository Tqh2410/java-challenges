package Day_4;

import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] A = new int[5];
        for (int i = 0; i < 5; i++){
            A[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++){
            System.out.println(A[i]);
        }
        int max = A[0], min = A[0];
        for (int i = 1; i < 5; i++) {
            if (A[i] > max){
                max = A[i];
            }
            if (A[i] < min){
                min = A[i];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

    }
}
