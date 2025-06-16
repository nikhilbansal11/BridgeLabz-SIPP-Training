import java.util.Scanner;

public class Trianlge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int heightCm = sc.nextInt();
        int base = sc.nextInt();

        double area = 0.5 * base * heightCm;

        double inch = ((double)heightCm / 2.54);
        double feet = (double)inch / 12;

        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inch);
        System.out.println("Area of triangle is " + area);

    }
}

/*Write a program that takes the base and height to find area of a triangle in square 
inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
 */
