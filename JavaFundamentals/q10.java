import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int heightCm = sc.nextInt();

        double inch = ((double)heightCm / 2.54);
        double feet = (double)inch / 12;

        System.out.println("Your Height in cm is " + heightCm +  " while in feet is " + feet + " and inches is " + inch);
        
    }
}

/*Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
 */
