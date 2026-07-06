package Brocode;
import java.util.Scanner;

public class lesson8_1 {

    // Гипотенуз олох
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double a,b,c;

        System.out.print("Please enter side a: ");
        a=scanner.nextDouble();

        System.out.print("Please enter side b: ");
        b= scanner.nextDouble();

        c= Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));

        System.out.println("The side c aka hypotenuse is "+c+ " cm");
    }

}
