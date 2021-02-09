
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        
        while (!(string.isEmpty())) {
            String[] parts = string.split(" ");
                   System.out.println(parts[0]);
                   string = scanner.nextLine();
        }

                    
        }

    }
