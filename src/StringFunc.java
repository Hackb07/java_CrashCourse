package strings;
public class StringFunc {
    public static void main(String[] args){
        String str1 = "HELLO" , str2 = "Hello";

        //returns the lenght of the string by using .len()
        System.out.println("The lenght of the str1 is " + str1.length());

        //equal methods to check the both strings are same or not (Case Sensitive) by using .equals(args)
        if (str1.equals(str2))
            System.out.println("Both or same.");
        else
            System.out.println("Both are not same.");

        //equals methods to check both the strings are same (not Case Sensitive)
        if (str1.equalsIgnoreCase(str2))
            System.out.println("Both are same.");
        else
            System.out.println("Both are not same.");

        //find the character at the given position
        System.out.println("The character at the position 2 is " + str1.charAt(2));
    }
}
