
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer intg = Integer.valueOf(scanner.nextLine());
        intg = intg ^2;
        System.out.println(intg);
    }
}
