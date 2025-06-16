import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double one = a + b * c;
        double two = a * b + c;
        double three = c + a / b;
        double four = a % b + c;

        System.out.println("The result of the operations are " + one + ", " + two + ", " +three + ", " +four);
    }
}


/*
 * Similarly, write the DoubleOpt program by taking double values and doing the same operations.
 */