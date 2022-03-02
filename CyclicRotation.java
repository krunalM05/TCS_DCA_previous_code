import java.io.*;
import java.util.*;

public class CyclicRotation 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
sc.nextLine();
int[] arr=new int[n];

for(int i=0;i<n;i++)
arr[i]=sc.nextInt();

int k=sc.nextInt();//value of k for rotation
if(k>n)
	k=k%n;

for(int i=0;i<k;i++)
{
	int temp=arr[n-1];
	System.out.println(temp);
	for(int j=0;j<n-1;j++)
	{
		arr[j+1] = arr[j];
	}

	arr[i]=temp;
}

for(int i=0;i<n;i++)
System.out.print(arr[i]+" ");
}
}
