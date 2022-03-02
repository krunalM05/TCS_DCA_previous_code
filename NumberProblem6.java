//given array[10 20 30 40 50] return sum of succeding ele from a ele i.e [140 120 90 50]
import java.io.*;
import java.util.*;

public class NumberProblem6 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
int[] ans=new int[n-1];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();

int sumAll=0;
for(int i=0;i<n;i++)
sumAll+=arr[i];

int currsum=0;

for(int i=0;i<n-1;i++)
{
	ans[i]=sumAll-currsum-arr[i];
	currsum+=arr[i];
}

for(int i=0;i<n-1;i++)
System.out.print(ans[i]+" ");
}
}
