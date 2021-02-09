
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int oldest = 0;

        while (!(input.isEmpty())) {
                String[] nameAge = input.split(",");
                for (int i = 1; i < nameAge.length; i = i + 2) {
                    if (Integer.parseInt(nameAge[i]) > oldest) {
                    oldest = Integer.parseInt(nameAge[i]);
                }
            }

            input = scanner.nextLine();
        }

        System.out.println(oldest);

    }
}