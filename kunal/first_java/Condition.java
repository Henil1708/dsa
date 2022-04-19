package first_java;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the emplyee salary : ");
        int salary = input.nextInt();

        if(salary > 10000){
            salary += 2000;
            System.out.println("Your salary is now : "+salary + "\nAfter adding 2000 bonus ");
        }else{
            System.out.println("Oops you have not receivied any bonus !!\nYour salary is : "+salary);

        }

    }
}
