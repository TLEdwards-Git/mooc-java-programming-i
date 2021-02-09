
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nNumber = 0;
        int sNumber=0;
        while (true){
            System.out.println("Give a number:");
            int gNumber = Integer.valueOf(scanner.nextLine());
            if (gNumber !=0) {
                sNumber +=gNumber;
                nNumber +=1;
            } else if ( gNumber==0) {
                sNumber +=gNumber;
                break;

            }
        }
        System.out.println("Number of numbers: "+nNumber);
        System.out.println("Sum of the numbers: "+sNumber);
    }

}