
import java.util.Scanner;

public class SumOfNumbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nNumber = 0;
        int sNumber=0;
        while (true){
            System.out.println("Give a number:");
            int gNumber = Integer.valueOf(scanner.nextLine());
            if (gNumber !=0) {
                sNumber +=gNumber;
            } else if ( gNumber==0) {
                sNumber +=gNumber;
                break;

            }
        }
        System.out.println("Sum of the numbers: "+sNumber);
    }

}