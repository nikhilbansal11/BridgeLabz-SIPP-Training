import java.util.*;

public class EmployeeBonus{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
double sal = s.nextDouble();
int yrs = s.nextInt();

if(yrs>5){
System.out.println("Bonus: "+(sal*0.05));
}
else{
System.out.println("No bonus");
}
}
}
