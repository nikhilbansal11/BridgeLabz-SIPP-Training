import java.util.*;

public class NaturalSumFor{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int n = s.nextInt();

if(n>=1){
int sum=0;
for(int i=1;i<=n;i++){
sum+=i;
}
int form = n*(n+1)/2;
System.out.println("Sum by loop: "+sum);
System.out.println("Sum by formula: "+form);
}
else{
System.out.println("Not a natural number");
}
}
}
