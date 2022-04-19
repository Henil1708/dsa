package first_java;

import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number in this following format");
        System.out.print("P*R*T : ");

        float p= input.nextInt(), r= input.nextInt(), t=input.nextInt();
        float ans = (p*r*t)/100;

        System.out.println("Your answer is : "+ans);





    }
}
