import java.util.*;
class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt(), h1 = sc.nextInt();
        int age2 = sc.nextInt(), h2 = sc.nextInt();
        int age3 = sc.nextInt(), h3 = sc.nextInt();

        if (age1 <= age2 && age1 <= age3) System.out.println("Amar is youngest");
        else if (age2 <= age1 && age2 <= age3) System.out.println("Akbar is youngest");
        else System.out.println("Anthony is youngest");

        if (h1 >= h2 && h1 >= h3) System.out.println("Amar is tallest");
        else if (h2 >= h1 && h2 >= h3) System.out.println("Akbar is tallest");
        else System.out.println("Anthony is tallest");
    }
}