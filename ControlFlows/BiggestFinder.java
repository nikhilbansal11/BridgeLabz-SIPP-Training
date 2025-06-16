import java.util.Scanner;

public class BiggestFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        boolean one = x >= y && x >= z;
        boolean two = y >= x && y >= z;
        boolean three = z >= x && z >= y;
        System.out.println("Is the first number the largest? " + one);
        System.out.println("Is the second number the largest? " + two);
        System.out.println("Is the third number the largest? " + three);
    }
}
