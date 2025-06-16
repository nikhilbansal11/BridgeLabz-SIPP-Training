import java.util.*;

public class SumUntilNonPositive{
public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double sum = 0;

        while(true){
        double z = s.nextDouble();
        if(z<=0) break;
        sum += z;
        }
        System.out.println("Total: "+sum);
        }
}
