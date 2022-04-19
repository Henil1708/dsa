package first_java;

public class Loops {
    public static void main(String[] args) {
        int x = 101;
        int temp=0,sum=x;

        while(Math.abs(x) > 0){

            int rem = x % 10;

            temp = (temp*10)+rem;

            x = x/10;

        }
        System.out.println(temp==sum);
//        return x == temp ;

    }
}
