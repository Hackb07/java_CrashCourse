package operator;

public class BinaryOperator {
    public static void main(String[] args){
        byte a , b , res ;
        a = 10 ;
        b = 12 ;
        //Checking wheather the a and b are binary
        System.out.println("The value of a : " + a);
        System.out.println("The value of b : " + b);
        //bitwise Complemetn
        res = (byte) ~a;
        System.out.println("The Complement of A : " +  res);

        //bitwise AND operator = "&"
        res = (byte) (a & b );
        System.out.println("The AND Operator of A and B : " + res);

        //bitwise OR operator = "|"
        res = (byte) (a | b);
        System.out.println("The OR operator of a and b : " +  res);

        //bitwise XOR operator = "^"
        res = (byte)(a^b);
        System.out.println("The XOR operator of a and b : " + res);

        //bitwise RightShift operator = "<<"
        res = (byte) (a << b);
        System.out.println("The Right Shift operator of a and b : " + res);

        //bitwise Leftshift operator = ">>"
        res = (byte) (a >> b);
        System.out.println("The Left Shift Operator : "+ res);
    }
}
