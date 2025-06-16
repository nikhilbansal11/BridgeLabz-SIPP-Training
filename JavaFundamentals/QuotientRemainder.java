import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int division = num1 / num2;
        int rem = num1 % num2;

        System.out.println("The Quotient is " + division + " and Reminder is " + rem + " of two number "+ num1 + " and " + num2);
    }
}

/*Write a program to take 2 numbers and print their quotient and reminder
Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
I/P => number1, number2
O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___
 */
