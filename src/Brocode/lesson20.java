package Brocode;

import java.util.Scanner;

public class lesson20 {
    public static void main(String[] args){

        //   && = AND
        //   || = OR
        //    ! = NOT


        Scanner scanner = new Scanner(System.in);

        double temp=30;
        boolean isSunny=true;

        if(temp<=30 && temp >0 && isSunny){
            System.out.println("It is sunny And nice weather");
        } else if(temp<=30 && temp > 0 && !isSunny){
            System.out.println("It is nice weather but cloudy");
        } else if (temp>30 || temp<0){
            System.out.println("It is not nice outside");
        }
        scanner.close();
    }
}
