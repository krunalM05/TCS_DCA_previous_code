//how many elements lesser than current in array initially all are 1
/* ex: [100 60 70 65 80 85] output [1 1 2 1 4 5]*/

import java.io.*;
import java.util.*;

public class NumberProblem7 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
int ans[]=new int[n];

for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
	ans[i]=1;
}
int c;
for(int i=1;i<n;i++)
{
	c=0;
	for(int j=i;j>0;j--)
	{
		if(arr[i]<arr[j-1])
			break;
		else if(arr[i]>arr[j-1])
			c=c+1;
	}

	ans[i]+=c;
}
for(int i=0;i<n;i++)
{
	System.out.print(ans[i]+" ");
}
}
}
