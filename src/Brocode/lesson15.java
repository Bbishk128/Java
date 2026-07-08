package Brocode;
import java.util.Scanner;

public class lesson15 {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        int option;
        double kgs;
        double lbs;

        System.out.println("=====Weight converter=====");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");
        System.out.print("Choose your option: ");
        option= scanner.nextInt();

        if(option==1){
            System.out.print("Enter weight in lbs: ");
            lbs=scanner.nextDouble();
            kgs=lbs*0.45359;
            System.out.println("Your weight is "+kgs+"kg");
        } else if(option==2){
            System.out.print("Enter weight in kgs: ");
            kgs=scanner.nextDouble();
            lbs= kgs*2.205;
            System.out.println("Your weight is "+lbs+"kg");
        }else{
            System.out.println("Please enter 1 or 2");
        }
    }
}
