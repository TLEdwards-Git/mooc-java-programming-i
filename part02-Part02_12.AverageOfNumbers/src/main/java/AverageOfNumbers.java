
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nNumber = 0;
        double sNumber=0;
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
        System.out.println("Average of the numbers: "+(sNumber /nNumber));
    }

}