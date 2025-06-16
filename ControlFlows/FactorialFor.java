import java.util.*;

public class FactorialFor{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int n = s.nextInt();

if(n>=0){
int f=1;
for(int i=1;i<=n;i++){
f*=i;
}
System.out.println("Factorial: "+f);
}
else{
System.out.println("Invalid number");
}
}
}
