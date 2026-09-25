package operators;
import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b , result ; //initalizing the variables

        System.out.print("Enter the value a : ");
        a = sc.nextInt();// Value A input
        System.out.print("Enter the value b : ");
        b = sc.nextInt();// Value B input

        result = a+b ;
        System.out.println("The Sum : " + result);

        result = a-b ;
        System.out.println("The Difference : " +  result);

        result = a*b ;
        System.out.println("The Product : " + result);

        result = a/b ;
        System.out.println("The Division : " + result);

        result = a%b ;
        System.out.println("The Floor Division : " + result);


    }
}