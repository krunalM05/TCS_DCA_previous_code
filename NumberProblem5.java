import java.io.*;
import java.util.*;

public class NumberProblem5 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
//4th power of num their last digit same or not

int num=sc.nextInt();
long power4th=(long)Math.pow(num, 4);
int rem1=num%10;
int rem2=(int)(power4th%10);
if(num<0)
	System.out.println("Wrong Input");
else if(rem1==rem2)
	System.out.println("Matching found");
else
	System.out.println("No Matching");

}
}
