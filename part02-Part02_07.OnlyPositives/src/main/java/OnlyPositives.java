
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Give a number:");
            int gNumber = Integer.valueOf(scanner.nextLine());
            if (gNumber <0) {
                System.out.println("Unsuitable number");
            } else if (gNumber > 0){
                System.out.println(gNumber * gNumber);
            } else if ( gNumber==0) {
                break;
            }
        }
    }
}
