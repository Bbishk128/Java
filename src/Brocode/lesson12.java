package Brocode;

public class lesson12 {
    public static void main(String[] args){

        //we are checking nested if statements
        //we change our boolean to true pr false to check all the possible outcome in our nested f statement


        boolean isstudent=true;
        boolean issenior=true;
        double price=9.99;

        if(isstudent){
            if(issenior){
                System.out.println("You get 20% off for being a senior");
                System.out.println("You get 10% off for being a student");
                price *=0.7;
            } else {
                System.out.println("You get 10% off for being a student");
                price *= 0.9;
            }
        }else{
            if(issenior){
                System.out.println("You get 20% off for being a senior");
                price*=0.8;
            }
                price *=1;
        }
        System.out.printf("Your total will be $%.2f", price);
    }
}

