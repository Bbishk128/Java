package Brocode;
import java.util.Scanner;

public class lesson17 {
    public static void main(String[] args){

        // Temperature converter
        // used ternary operator

        Scanner scanner = new Scanner(System.in);

        String answer;
        double newTemp;
        double Temp;

        System.out.println("=====Temperature converter=====");
        System.out.print("Please enter your temperature: ");
        Temp=scanner.nextDouble();

        System.out.print("Convert it to? (C or F): ");
        answer=scanner.next().toUpperCase();

        newTemp=(answer.equals("C")) ? (Temp - 32.0) * 5.0 / 9.0 : Temp * 9.0 / 5.0 + 32.0;
        System.out.printf("Your temperature in %s is %.2f", answer, newTemp);

        scanner.close();
    }
}
