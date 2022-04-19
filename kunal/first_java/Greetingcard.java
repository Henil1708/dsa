package first_java;

import java.util.Scanner;

public class Greetingcard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your value : ");
        String name = input.nextLine().trim();
        System.out.println("===========================================");
        System.out.println("Welcome "+name+" to this coding practice !!");
        System.out.println("===========================================");
    }

}
