package Brocode;

import java.util.Scanner;

public class lesson18 {
    public static void main(String[] args){
        // Enhanced switches == Replacement for using many if else switches.
        //                      Just a switch but BETTER.

        Scanner scanner= new Scanner(System.in);
        System.out.print("Please enter your day: ");
        String day=scanner.nextLine();

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday sadly");
            case "Saturday", "Sunday" -> System.out.println("it is a weekend");
            default -> System.out.printf("%s is not a day", day);
        }

    }
}
