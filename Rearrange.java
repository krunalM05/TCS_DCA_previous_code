import java.io.*;
import java.util.*;

public class Rearrange 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
int[] arr=new int[size];
for(int i=0;i<size;i++)
	arr[i]=sc.nextInt();

Arrays.sort(arr);
for(int i=0;i<size;i++)
	System.out.print(arr[i]+" ");
for(int i=1;i<size-1;i+=2)
{
	int temp = arr[i];
	arr[i]=arr[i+1];
	arr[i+1] =temp;
}

for(int i=0;i<size;i++)
	System.out.print(arr[i]+" ");
}
}
