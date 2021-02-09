
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nNumber = 0;
        double sNumber=0;
        int countN =0;
        while (true){
            System.out.println("Give a number:");
            int gNumber = Integer.valueOf(scanner.nextLine());
            if (((countN==0)&&(gNumber==0))) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (((countN!=0)&&(gNumber==0))) {
                break;
            } else if(gNumber>0) {
                sNumber +=gNumber;
                nNumber +=1;
                countN +=1;      
            }

        }
        System.out.println(sNumber/nNumber);
        
    }
}