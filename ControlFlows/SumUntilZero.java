import java.util.*;

public class SumUntilZero{
public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    double total=0;
    double x=s.nextDouble();

    while(x!=0){
    total+=x;
    x=s.nextDouble();
    }

    System.out.println("Total: "+total);
    }
}
