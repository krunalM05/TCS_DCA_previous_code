import java.io.*;
import java.util.*;

public class CountContineousSubArray 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int arr[] = new int[N];
for(int i=0;i<N;i++)
{
    arr[i]=sc.nextInt();
}

int c=1,b=1;
int max=Integer.MIN_VALUE;
for(int i=0;i<N-1;i++)
{
    for(int j=i ; j<N-2 ; j++)
    {
        if(arr[j+1] == (arr[j]+1))
        {
            c=c+1;
        

        }

        if(arr[j+1] != (arr[j]+1))
        {
            if((arr[j+2] == arr[j]+1) && b==1)
            {
                j++;
                b=0;
            continue;
            }
            
        }

        if(arr[j+1] != (arr[j]+1) && b==0)
        {
            break;
        }

    }

    if(c>max)
        max=c;

    b=0;c=0;
}

System.out.println(max);
}
}
