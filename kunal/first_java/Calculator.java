package first_java;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float ans =0;
        while (true){
            char operator = input.next().trim().charAt(0);
            if(operator == '+' || operator == '-' || operator == '*' || operator == '/'){
                System.out.print("Enter 1st number : ");
                int number1 = input.nextInt();
                System.out.println();
                System.out.println("Enter 2nd number : ");
                int number2 = input.nextInt();


                if(operator == '+'){
                    ans = number1 + number2;
                }
                if(operator == '-'){
                    ans = number1-number2;

                }
                if(operator == '*'){
                    ans = number1*number2;

                }
                if(operator == '/'){
                    ans = number1/number2;

                }
                System.out.println("Your answer is "+ans);

            }else if(operator == 'X' || operator == 'x'){
                break;
            }
        }


    }
}
