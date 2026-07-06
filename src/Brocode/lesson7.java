package Brocode;
import java.util.Random;

public class lesson7 {
    //random number generator
    public static void main(String[] args){
        Random random = new Random();
        int number;
        double decimal;
        boolean isheads;

        number=random.nextInt(1, 101);
        decimal=random.nextDouble(0, 101);
        isheads= random.nextBoolean();

        System.out.println("The witch is "+number+" years old");
        System.out.println("Decimal point is "+decimal);
        if(isheads){
            System.out.println("It's head");
        } else{
            System.out.println("It's tails");
        }

    }
}
