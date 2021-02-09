
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int toNumber = scanner.nextInt();
        System.out.println("Where from?");
        int fromNumber = scanner.nextInt();
        for (int i = fromNumber; i <= toNumber; i++) {
            System.out.println(i);
        }
        
    }
}