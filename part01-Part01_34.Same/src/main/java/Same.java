
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Password?");
        String second = reader.nextLine();
        String password = scanner.nextLine();
        if (password.equals(second)) {
            System.out.println("Same"); 
        } else {
            System.out.println("Different"); 
        }
    }
}