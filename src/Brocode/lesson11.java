package Brocode;
import java.util.Scanner;

public class lesson11 {
    public static void main(String[] args){
        // compound interest calculator

        Scanner scanner=new Scanner(System.in);

        double principle_amount, finish_amount ,interest_rate,compound_per_year;
        int year;

        System.out.print("Enter the principle amount: ");
        principle_amount=scanner.nextDouble();

        System.out.print("Enter the interest rate: ");
        interest_rate=scanner.nextInt();

        System.out.print("Enter the number of times compounded per year: ");
        compound_per_year= scanner.nextInt();

        System.out.print("Enter the number of years: ");
        year= scanner.nextInt();

        finish_amount=principle_amount*Math.pow((1+interest_rate/100/compound_per_year),compound_per_year*year);


        System.out.printf("The amount after %d year is $%,.0f", year, finish_amount);

        scanner.close();
    }
}
