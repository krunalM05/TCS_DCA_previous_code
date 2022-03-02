import java.io.*;
import java.util.*;

public class Secondlargest 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
sc.nextLine();
int[] arr=new int[n];

for(int i=0;i<n;i++)
arr[i]=sc.nextInt();

Arrays.sort(arr);

int max=arr[n-1];
int secondMax=0;
for(int i=n-2;i>=0;i--)
{
	if(arr[i]!=max)
	{
		secondMax=arr[i];
		break;
	}
}

System.out.println(secondMax);
}
}
