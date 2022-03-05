import java.io.*;
import java.util.*;

public class MedianBonus 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int d = sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
int c=0;
for(int i=d;i<n;i++)
{
   int[] arr2 = Arrays.copyOfRange(arr,i-d,i);
   int k = findMedian(arr2,d);
    if(arr[i]>=k)
    {
        c++;
    }
}

System.out.println(c);
}

public static int findMedian(int arr[],int d)
{
    Arrays.sort(arr);
    return(arr[d/2]);

}
}
