package Brocode;

import java.util.Scanner;

public class lesson21 {
    public static void main(String[] args){

        // While loops == Хэрвээ нөхцөл нь үнэн хэвээр байх юм бол кодыг давтан биелүүлсээр байх болно.

        Scanner scanner = new Scanner(System.in);
        String name="";

        while(name.isEmpty() || name.equals(" ")){    //нэрээ оруулах хүртэл үргэлжилсээр байх болно
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello "+ name);
        scanner.close();
    }
}
