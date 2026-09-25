package  operators;

public class Unaryoperators {
    public static void  main (String[] args) {
        int a, b, result ;
        a = 50 ;
        System.out.println("The Current value : " + a) ;

        b = -a; // inverts the sign of the value by placing the - symbol prefix of the variable
        System.out.println("The value after Inverts : " + b );

        a = 50 ;
        b = a++; // post increament is stored in the variable called b = stores previous variable and a will be increamented
        System.out.println("The value of a : " + a  + " and the value of b : " + b );

        a = 50 ;
        b = ++a ;// it stores the incremented value in both of the variables
        System.out.println("The value of a : " + a  + " and the value of b : " + b );

        a = 50 ;
        b = a-- ;// post decrement is stored in the variable called b = stores previous variable and a will be decrement
        System.out.println("The value of a : " + a  + " and the value of b : " + b );

        a = 50 ;
        b = --a ;// it stores the decrement  value in both of the variables.
        System.out.println("The value of a : " + a  + " and the value of b : " + b );

        //Boolean Unary Operators.
        boolean isStudent , res ;
        isStudent = true ;
        res = !isStudent ;  // the inverse can e created using the exclamatory symbol for boolean datatype.
        System.out.println("IsStudent : " + isStudent);
        System.out.println("The Inverse of IsStudent : " + res);
    }
}
