package Day_1;

import java.util.Scanner;
public class studentInfomation {
    public static void main(String [] args){
        String id, name, classes, school;
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID = ");
        id = scanner.nextLine();
        System.out.print("Name = ");
        name = scanner.nextLine();
        System.out.print("Age = ");
        age = scanner.nextInt();
        //clear
        scanner.nextLine();

        System.out.print("Class = ");
        classes = scanner.nextLine();
        System.out.print("School = ");
        school = scanner.nextLine();

        System.out.println("Your Infomation: ");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Class: " + classes);
        System.out.println("School: " + school);


    }
}
