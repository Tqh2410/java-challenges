package Day_2;

import java.util.Scanner;

public class dayInMonthCalculator {
    public static void main (String[] args){
        int month, year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the month: ");
        month = scanner.nextInt();
        System.out.print("Type the year: ");
        year = scanner.nextInt();
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Month: " + month + " of Year: " + year + " has 31 days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Month: " + month + " of Year: " + year + " has 30 days");
                break;
            case 2:
                boolean isLeapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
                if (isLeapYear){
                    System.out.println("Month: " + month + " of Year: " + year + " has 29 days");
                } else {
                    System.out.println("Month: " + month + " of Year: " + year + " has 28 days");
                }
                break;
        }
    }
}
