public class diceproblem {
    public static void main(String[] args) {
        int die1 = (int)(Math.random() * 6) + 1;
        int die2 = (int)(Math.random() * 6) + 1; 
        int sum = die1 + die2; 

        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Sum: " + sum);
    }
}
