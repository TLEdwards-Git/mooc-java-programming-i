
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Password?");
        String second = reader.nextLine();
        String password = scanner.nextLine();
        if (password.equals(second)) {
            System.out.println("Welcome!"); 
        } else {
            System.out.println("Off with you!"); 
        }
    }
}

