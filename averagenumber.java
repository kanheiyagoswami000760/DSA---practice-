import java.util.Scanner;

public class averagenumber {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double average = sum / n;
        System.out.println("Average: " + average);
    }
}
