package Day_2;
import java.util.Scanner;

public class exercise1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        double r, c;
        System.out.print("R = ");
        r = scanner.nextDouble();
        c = 2 * Math.PI * r;
        System.out.print("C = " + c);
    }
}
