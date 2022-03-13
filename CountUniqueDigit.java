import java.io.*;
import java.util.*;

public class CountUniqueDigit
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int lb=sc.nextInt();
int ub=sc.nextInt();
int c=0;
System.out.print(lb+" "+ub);

for(int i=lb; i<=ub; i++)
{
	int[] arr=new int[10];

	for(int k=0;k<10;k++)
	{
		arr[k]=0;
	}

   int num=i;
	while(num>0)
	{

		if(arr[num%10]==1)
		{
			break;
		}

		arr[num%10]=1;
		num = num/10;


	}
	if(num==0)
		c=c+1;
}
System.out.println(c);
}
}
