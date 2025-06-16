import java.util.*;

public class NaturalSumWhile{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int n = s.nextInt();

if(n>=1){
int i=1;
int sum=0;

while(i<=n){
sum+=i;
i++;
}

int formula = n*(n+1)/2;
System.out.println("Sum by loop: "+sum);
System.out.println("Sum by formula: "+formula);
}
else{
System.out.println("Not a natural number");
}
}
}
