
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess = Integer.valueOf(scanner.nextLine());
        for(int guess1=guess;guess1<101;guess1++){
            System.out.println(guess1);
            
        }

    }
}

