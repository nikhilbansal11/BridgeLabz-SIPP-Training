import java.util.*;

public class FactorialWhile{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int num = s.nextInt();

if(num>=0){
int i=1;
int fact=1;
while(i<=num){
fact*=i;
i++;
}
System.out.println("Factorial: "+fact);
}
else{
System.out.println("Invalid number");
}
}
}
