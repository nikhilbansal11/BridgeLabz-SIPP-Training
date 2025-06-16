import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        int quantity = sc.nextInt();

        double cost = price * quantity;

        System.out.println("The total purchase price is INR " + cost + " if the quantity " + quantity + " and unit price is INR " + price);


    }
}

/*Write a program to input the unit price of an item and the quantity to be bought. 
Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___ */
