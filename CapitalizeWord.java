
import java.util.Scanner;

public class CapitalizeWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        if (word.length() == 0) {
            System.out.println(word);
        } else {
        
            String result = word.substring(0, 1).toUpperCase() + word.substring(1);
            System.out.println(result);
        }
    }
}