
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string: ");
        String str1 = scan.nextLine();
        System.out.println("Give an integer: ");
        int integer = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double: ");
        double floatpoint = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean: ");
        boolean bool = Boolean.valueOf(scan.nextLine()); 
        System.out.println("You gave the string " +str1);
        System.out.println("You gave the integer " +integer);
        System.out.println("You gave the double " +floatpoint);
        System.out.println("You gave the boolean " +bool);
        
        

        

        // Write your program here

    }
}
