import java.util.Scanner;

public class yardsDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int feets = sc.nextInt();

        double yard = (double) feets / 3;

        double mile = (double) yard / 1760;

        System.out.println("Your Height in feets is "+ feets + " yards is " + yard + " miles is " + mile);
    }
}

/*Write a program the find the distance in yards and miles for the distance provided by user in feets
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
 */
