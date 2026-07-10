package Brocode;

import java.util.Scanner;

public class lesson19 {
    public static void main(String[] args){
        // CALCULATOR

        Scanner scanner = new Scanner(System.in);

        double num1, num2, result=0;
        char operator;
        boolean validperation=true; //энэ байхгүй бол хариу гарах боломжгүй гэдгийг хэвлэж болохгүй бга

        System.out.print("Please enter first number: ");
        num1= scanner.nextDouble();

        System.out.print("Enter an operator ( * / + - ^ ) : ");
        operator=scanner.next().charAt(0); // charAt(0) 0 дээр бх ямар ч утгийг char болгож буцаана

        System.out.print("Please enter second number: ");
        num2=scanner.nextDouble();

        switch(operator){
            case '+' -> result=num1+num2;
            case '-' -> result = num1 - num2;
            case '/' -> {
                if(num2==0){
                    System.out.println("Cannot divide by 0!");
                    validperation=false;
                }else {
                    result = num1 / num2;
                }
            }
            case '*' -> result= num1 * num2;
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator");
                validperation=false;
            }
        }

        if(validperation){
        System.out.println("Your answer is "+ result);}
        else{
            System.out.println("Invalid operation");
        }
        scanner.close();
    }
}
