package operators;
public class ConditionalOperator {
    public static void main(String[] args){
        boolean result , a , b ;
        a = true ;
        b = false;

        result = a || b ; //atleast One should be True,  then only returns true
        System.out.println(result);

        result = a && b ; // Both  should be true, then only return true
        System.out.println(result);
    }

}

