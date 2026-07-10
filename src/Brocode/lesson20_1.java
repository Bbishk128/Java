package Brocode;

import java.util.Scanner;

public class lesson20_1 {
    public static void main(String[] args) {

        //   && = AND
        //   || = OR
        //    ! = NOT
        // username must be between 4-12 characters long
        // username must not contain any spaces and underscope

        Scanner scanner = new Scanner(System.in);
        String username;

        System.out.print("Please enter your username: ");
        username= scanner.nextLine();

        if(username.length()<4 || username.length()>12){
            System.out.println("User name must be between 4 to 12");
        } else if(username.contains(" ") || username.contains("_")){
            System.out.println("You can not use any spaces or underscopes!");
        }else {
            System.out.printf("Welcome! Your username is %s", username);
        }
        scanner.close();
    }
}