package Brocode;
import java.util.Scanner;

public class lesson8_2 {
    public static void main(String[] args){
        // Тойргийн хүрээний урт
        // Тойргийн талбай
        // Цилиндрийн эзэлхүүн

        Scanner scanner=new Scanner(System.in);
        double radius, height, round, area, volume;

        System.out.print("Please enter the radius: ");
        radius=scanner.nextDouble();

        System.out.print("Please enter the height of the cylinder: ");
        height=scanner.nextDouble();

        round=Math.PI*2*radius;
        area=Math.PI*Math.pow(radius, 2);
        volume=area*height;

        System.out.println("The circunference is "+round+ " cm");
        System.out.println("The area is "+area+ " cm^2");
        System.out.println("The volume is "+ volume+" cm^3");
    }
}
