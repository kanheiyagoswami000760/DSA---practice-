// ...existing code...
import java.util.Scanner;

public class averagerecursive {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        double avg = sum(arr, n) / (double) n;
        System.out.println(avg);
        sc.close();
    }

    static long sum(int[] a, int n){
        if (n == 0) return 0;
        return a[n - 1] + sum(a, n - 1);
    }
}