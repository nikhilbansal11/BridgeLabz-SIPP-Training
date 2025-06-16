import java.util.*;

public class CountdownWhile{
public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    while(num>=1){
    System.out.println(num);
    num--;
    }
}
}
