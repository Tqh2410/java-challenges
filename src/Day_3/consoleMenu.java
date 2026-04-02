package Day_3;

import java.util.Scanner;

public class consoleMenu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int option;
        do{
            System.out.println("---------MENU--------");
            System.out.println("1. Greating");
            System.out.println("2. Sing La-la-la");
            System.out.println("3. Exit");
            System.out.print("Type your choice (1-3): ");
            option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("Hi! Have a good day!");
                    break;
                case 2:
                    System.out.println("La la la la la la la la la");
                    break;
                case 3:
                    break;

            }
        }while (option != 3);
        scanner.close();
    }
}
