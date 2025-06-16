import java.util.*;

public class MultiplicationTable{
public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int x = s.nextInt();

    for(int i=6;i<=9;i++){
    System.out.println(x+" * "+i+" = "+(x*i));
    }
    }
}
