package first_java;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your value :");
        int value = scanner.nextInt();

        if(value % 2 == 0){
            System.out.println("The value is an even number.");
        }else{
            System.out.println("The value is an odd number.");
        }


    }
}
