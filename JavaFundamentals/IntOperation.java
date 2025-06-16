import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int one = a + b * c;
        int two = a * b + c;
        int three = c + a / b;
        int four = a %b + c;

        System.out.println("The result of the operations are " + one + " " + two + " " +three + " " +four);
    }
}
/*Write an IntOperation program by taking a, b, and c as input values and print the following integer 
operations a + b *c, a * b + c, c + a / b, and a % b + c. 
Please also understand the precedence of the operators. 
Hint => 
Create variables a, b, and c of int data type.
Take user input for a, b, and c.
Compute 3 integer operations and assign the result to a variable
Finally, print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are ___, ___, and ___ */