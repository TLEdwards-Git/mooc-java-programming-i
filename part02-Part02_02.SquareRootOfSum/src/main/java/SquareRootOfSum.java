
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int int1 = Integer.valueOf(scanner.nextLine());
        int int2 = Integer.valueOf(scanner.nextLine());
        int sum1 =int1 + int2;
        double squared = Math.sqrt(sum1);
        System.out.println(squared);
        
        

    }
}
