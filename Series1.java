/*
Identify the logic behind the series
6 28 66 120 190 276…
If input is 2, output will be
• 00006
• 00028 00066
If input is 3, output will be
• 00006
• 00028 00066
• 00120 00190 00276
*/
import java.io.*;
import java.util.*;

public class Series1 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int k=2,l=1;
for(int i=0;i<n;i++)
{
	for(int j=0;j<=i;j++)
	{
		k=2*l;
		int var = k * (2*k-1);
		l++;
		System.out.printf("%05d ",var);
	}

	System.out.println();
}
}
}
