import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        
        int upperCount = 0;
        int lowerCount = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCount++;
            } else {
                lowerCount++;
            }
        }
        if (upperCount > lowerCount) {
            System.out.println(word.toUpperCase());
        } else {
            System.out.println(word.toLowerCase());
        }
    }
}
