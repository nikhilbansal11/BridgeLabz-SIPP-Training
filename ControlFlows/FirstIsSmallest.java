import java.util.Scanner;

public class FirstIsSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean check = (a <= b && a <= c);
        System.out.println("Is the first number the smallest? " + check);
    }
}
