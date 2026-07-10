package Brocode;

import java.util.Scanner;

public class lesson21_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int age = 0;

        System.out.println("Enter your age: ");
        age= scanner.nextInt();

        while(age<0){
            System.out.println("Your age cant be negative");
            System.out.println("Enter your age: ");
            age= scanner.nextInt();
        }

        System.out.println("You are " + age+ "Years old");
        scanner.close();
    }
}
