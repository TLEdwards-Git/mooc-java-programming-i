
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        
        while (!(string.isEmpty())) {
            String[] parts = string.split(" ");
            System.out.println(parts[parts.length-1]);
            string = scanner.nextLine();
        }
                    
        }

    }
