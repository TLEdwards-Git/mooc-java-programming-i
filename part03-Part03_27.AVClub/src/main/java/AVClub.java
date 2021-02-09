
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        
        while (!(string.isEmpty())) {
            String[] strings =string.split(" ");
            for (String word : strings) {
                if(word.contains("av")) {
                    System.out.println(word);
            }
        }
            string = scanner.nextLine();
        }
    }

}
