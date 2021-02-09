
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if(input ==-1) {
                break;
            }
            list.add(input);
        }
        System.out.println("");
        double sum=0;
        for(Integer numbers: list) {
            sum+=numbers;
            

        }
        double average= sum/list.size();
        System.out.println("Average: " +average);
    }
}
