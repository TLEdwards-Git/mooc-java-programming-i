
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countUp = Integer.valueOf(scanner.nextLine());
        int sum=0;
        for (int i =0;i<countUp;i++){
            sum+=i;

        }
        sum+=countUp;
        System.out.println("Last number? "+countUp);
        System.out.println("The sum is " +sum);
    }
    
}
