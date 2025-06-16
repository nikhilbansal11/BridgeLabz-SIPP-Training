import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1) {
            int total = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + total);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}
