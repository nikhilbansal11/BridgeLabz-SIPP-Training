import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Parameter: ");
        double parameter = sc.nextInt();

        double side = Math.pow(parameter, 0.25);

        System.out.println("The length of the side is " + side + " whose perimeter is " + parameter);
    }
}


/*Write a program to find the side of the square whose parameter you read from user 
Hint => Perimeter of Square is 4 times side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____
 */